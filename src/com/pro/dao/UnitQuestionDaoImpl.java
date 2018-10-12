package com.pro.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pro.domain.Question;
import com.pro.domain.Teacher;
import com.pro.domain.UnitQuestion;

public class UnitQuestionDaoImpl extends BaseDao implements UnitQuestionDao {

	@Override
	public void insertUnitQue(Connection conn, UnitQuestion unitQuestion) throws Exception {
		String sql = "insert into unitQuestion(unitQuestionId,questionId,unitId) values(SeqId.NEXTVAL,?,?)";
		Object[] param = {unitQuestion.getQuestionId(),unitQuestion.getUnitId()};
		this.exeSql(conn, sql, param);
	}

	@Override
	public List<Question> findUnitQuestion(Connection conn, String unitId) throws Exception {
		String sql = "select * from unitquestion uq,question q,teacher t where uq.QUESTIONID=q.QUESTIONID and q.TEAID=t.TEAID and unitId=?";
		Object[] param = {unitId};
		ResultSet rs = this.getRs(conn, sql, param);
		List<Question> questionList = new ArrayList<Question>();
		while(rs.next()){
			Question question = new Question();
			question.setQuestionId(rs.getInt("questionId"));
			question.setQuestionValue(rs.getString("questionValue"));
			question.setTeacher(new Teacher(rs.getInt("teaId"),rs.getString("teaName")));
			questionList.add(question);
		}
		return questionList;
	}

	@Override
	public List<Question> getAllUnitQuestion(Connection conn, String unitId)
			throws Exception {
		String sql = "select * from unitQuestion where unitId=?";
		Object[] param = {unitId};
		ResultSet rs = this.getRs(conn, sql, param);
		List<UnitQuestion> unitQuestionList = new ArrayList<UnitQuestion>();
		while(rs.next()){
			UnitQuestion unitQuestion = new UnitQuestion();
			unitQuestion.setUnitId(rs.getString("unitId"));
			unitQuestion.setUnitQuestionId(rs.getInt("unitQuestionId"));
			unitQuestion.setQuestionId(rs.getInt("questionId"));
			unitQuestionList.add(unitQuestion);
		}
		
		List<Question> questionList = new ArrayList<Question>();
		for(int i=0;i<unitQuestionList.size();i++){
			UnitQuestion unitQuestion1 = unitQuestionList.get(i);
			sql = "select uqs.QUESTIONID,q.QUESTIONVALUE,uqs.SCORE from unitQuestionScore uqs,question q where uqs.QUESTIONID=? and uqs.UNITID=? and q.QUESTIONID=uqs.QUESTIONID";
			Object param1[] = {unitQuestion1.getQuestionId(),unitId};
			ResultSet rs1 = this.getRs(conn, sql, param1);
			Question question  = new Question();
			if(rs1.next()){
				question.setQuestionId(rs1.getInt("questionId"));
				question.setQuestionValue(rs1.getString("questionValue"));
				question.setScore(rs1.getInt("score"));
			}
			questionList.add(question);
		}
		
		return questionList;
	}

}
