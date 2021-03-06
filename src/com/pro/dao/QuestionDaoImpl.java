package com.pro.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pro.domain.Question;
import com.pro.domain.Teacher;
import com.pro.util.PageModel;

public class QuestionDaoImpl extends BaseDao implements QuestionDao {

	@Override
	public void delete(Connection conn, int questionId) throws Exception {
		String sql = "delete from question where questionId = ?";
		Object param[]={questionId};
		this.exeSql(conn, sql, param);
	}

	@Override
	public void insert(Connection conn, Question question) throws Exception {
		String sql = "insert into question(questionId,teaId,questionValue) values(SeqId.NEXTVAL,?,?)";
		Object param[]={question.getTeacher().getTeaId(),question.getQuestionValue()};
		this.exeSql(conn, sql, param);
	}
	
	@Override
	public List<Question> selectAll(Connection conn) throws Exception {
		String sql = "select q.questionId,q.teaId,te.teaName,q.questionValue from question q,teacher te where q.teaId=te.teaId order by questionId";
		ResultSet rs = this.getRs(conn, sql, null);
		List<Question> questionList = new ArrayList<Question>();
		while(rs.next()){
			Question question = new Question();
			question.setQuestionId(rs.getInt("questionId"));
			question.setTeacher(new Teacher(rs.getInt("teaId"),rs.getString("teaName")));
			question.setQuestionValue(rs.getString("questionValue"));
			questionList.add(question);
		}
			
		return questionList;
	}

	@Override
	public Question selectOne(Connection conn, int questionId) throws Exception {
		String sql = "select q.questionId,q.teaId,te.teaName,q.questionValue from question q,teacher te where q.teaId=te.teaId and q.questionId=?";
		Object param[] = {questionId};
		ResultSet rs = this.getRs(conn, sql, param);
		Question question = new Question();
		while(rs.next()){
			question.setQuestionId(rs.getInt("questionId"));
			question.setTeacher(new Teacher(rs.getInt("teaId"),rs.getString("teaName")));
			question.setQuestionValue(rs.getString("questionValue"));
		}
		
		return question;
	}

	@Override
	public PageModel<Question> selectPage(Connection conn, int currentPage,
			int pageSize) throws Exception {
		String sql = "select * from (select rownum rn, e.* from (select q.questionId,q.teaId,te.teaName,q.questionValue from question q,teacher te where q.teaId=te.teaId order by q.QUESTIONID) e where rownum<=?) where rn>?";
		Object param[] = {currentPage*pageSize,(currentPage-1)*pageSize};
		ResultSet rs = this.getRs(conn, sql, param);
		List<Question> questionList = new ArrayList<Question>();
		while(rs.next()){
			Question question = new Question();
			question.setQuestionId(rs.getInt("questionId"));
			question.setTeacher(new Teacher(rs.getInt("teaId"),rs.getString("teaName")));
			question.setQuestionValue(rs.getString("questionValue"));
			questionList.add(question);
		}
		
		PageModel<Question> pagemodel = new PageModel<Question>();
		pagemodel.setList(questionList);
		pagemodel.setCurrentPage(currentPage);
		pagemodel.setPageSize(pageSize);
		pagemodel.setTotalRecord(this.getTotalRecord(conn,"select count(*) from question", null));
			
		return pagemodel;
	}

	@Override
	public void update(Connection conn, Question question) throws Exception {
		String sql = "update question set teaId=?,questionValue=? where questionId=?";
		Object param[]={question.getTeacher().getTeaId(),question.getQuestionValue(),question.getQuestionId()};
		this.exeSql(conn, sql, param);
	}
  
	
}
