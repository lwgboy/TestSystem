package com.pro.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pro.domain.Question;
import com.pro.domain.StuQuestionScore;
import com.pro.domain.Student;
import com.pro.domain.Unit;
import com.pro.domain.UnitQuestion;
import com.pro.util.PageModel;

public class StuQuestionScoreDaoImpl extends BaseDao implements StuQuestionScoreDao{

	@Override
	public void addStuQS(Connection conn, StuQuestionScore sqs)
			throws Exception {

		String sql = "insert into STUQUESTIONSCORE(ANSWERID,ANSWERVALUE,UNITID,QUESTIONID,STUID) values(SeqId.NEXTVAL,?,?,?,?)";
		Object param[] = {sqs.getAnswerValue(),sqs.getUnitId(),sqs.getQuestionId(),sqs.getStuId()};
		this.exeSql(conn, sql, param);
	}

	@Override
	public List<StuQuestionScoreDao> findStuQSAll(Connection conn,
			StuQuestionScore sqs) throws Exception {
		
		return null;
	}

	@Override
	public PageModel<StuQuestionScoreDao> findStuQSPage(Connection conn,
			StuQuestionScore sqs) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStuQS(Connection conn, StuQuestionScore sqs)
			throws Exception {
		
		String sql = "update STUQUESTIONSCORE set ANSWERSCORE=? where ANSWERID=?";
		Object param[] = {sqs.getAnswerScore(),sqs.getAnswerId()};
		this.exeSql(conn, sql, param);
	}

	/*
	 *用于 STUID和UNITID作为条件 查找StuQuestionScore
	 *返回不为空的话
	 *就说明STUID已经答过题
	 */
	@Override
	public StuQuestionScore findStuQSSingle(Connection conn,
			String stuId,String unitId) throws Exception {
		
		String sql = "select * from STUQUESTIONSCORE where STUID=? and unitId=?";
		Object param [] = {stuId,unitId};
		ResultSet rs = this.getRs(conn, sql, param);
		StuQuestionScore sq = null;
		if(rs.next()){
			sq = new StuQuestionScore();
			sq.setAnswerId(rs.getInt("ANSWERID"));
		}
		return sq;
	}

	@Override
	public List<StuQuestionScore> getStuQuestionScoreList(Connection conn,
			String unitId, String stuId) throws Exception {
		String sql ="select * from unitQuestion where unitId=?";
		Object param [] = {unitId};
		ResultSet rs = this.getRs(conn, sql, param);
		List<UnitQuestion> unitQuestionList = new ArrayList<UnitQuestion>();
		while(rs.next()){
			UnitQuestion unitQuestion = new UnitQuestion();
			unitQuestion.setUnitQuestionId(rs.getInt("unitQuestionId"));
			unitQuestion.setUnitId(rs.getString("unitId"));
			unitQuestion.setQuestionId(rs.getInt("questionId"));
			unitQuestionList.add(unitQuestion);
		}
		
		List<StuQuestionScore> stuQuestionScoreList = new ArrayList<StuQuestionScore>();
		
		for(int i = 0; i < unitQuestionList.size();i++){
			UnitQuestion unitQuestion1 = unitQuestionList.get(i);
			sql = "select sqs.ANSWERID,sqs.ANSWERVALUE,sqs.QUESTIONID,sqs.ANSWERSCORE,q.QUESTIONVALUE,uqs.SCORE from STUQUESTIONSCORE sqs,question q,unitQuestionScore uqs where q.QUESTIONID=sqs.QUESTIONID and uqs.QUESTIONID=sqs.QUESTIONID and uqs.UNITID=sqs.UNITID and sqs.unitId=? and sqs.stuId=? and sqs.questionId=? ";
			//sql = "select answerId from STUQUESTIONSCORE";
			//sql = "select sqs.ANSWERID \"a\",sqs.ANSWERVALUE \"b\",sqs.QUESTIONID \"c\",q.QUESTIONVALUE \"d\",uqs.SCORE \"e\" from STUQUESTIONSCORE sqs,question q,unitQuestionScore uqs where sqs.unitId=? and sqs.stuId=? and sqs.questionId=? and q.QUESTIONID=sqs.QUESTIONID and uqs.QUESTIONID=sqs.QUESTIONID and uqs.UNITID=sqs.UNITID";
			Object param1 [] = {unitId,stuId,unitQuestion1.getQuestionId()};
			ResultSet rs1 = this.getRs(conn, sql, param1);
			StuQuestionScore stuQuestionScore = new StuQuestionScore();
			if(rs1.next()){
				stuQuestionScore.setAnswerId(rs1.getInt("ANSWERID"));
				stuQuestionScore.setAnswerValue(rs1.getString("ANSWERVALUE"));
				stuQuestionScore.setQuestion(new Question(rs1.getInt("QUESTIONID"),rs1.getString("QUESTIONVALUE")));
				stuQuestionScore.setUnitQuestionScore(rs1.getInt("SCORE"));
				int answerScore = 0;
				if("".equals(rs1.getInt("ANSWERSCORE"))){
					answerScore = 0;
				}else{
					answerScore = rs1.getInt("ANSWERSCORE");
				}
				stuQuestionScore.setAnswerScore(answerScore);	
			}
			stuQuestionScoreList.add(stuQuestionScore);
		}
		
		return stuQuestionScoreList;
	}


	@Override
	public void update_stuQuestionScore_answerValue(Connection conn,
			String unitId, String stuId, int questionId, String answerValue)
			throws Exception {
		String sql = "update stuQuestionScore set answerValue=? where unitId=?  and stuId=? and questionId=?";
		Object param [] = {answerValue,unitId,stuId,questionId};
		this.exeSql(conn, sql, param);
	}


	@Override
	public List<Student> findStuGetScore(Connection conn,String unitId) throws Exception {
		
		String sql = "select * from student";
		Object param[] = {};
		ResultSet rs = this.getRs(conn, sql, param);
		List<Student> st = new ArrayList<Student>();
		Student stu = null;
		while(rs.next()){
			stu = new Student();
			stu.setStuId(rs.getString("stuId"));
			stu.setStuName(rs.getString("stuName"));
			stu.setStuPwd(rs.getString("stuPwd"));
			st.add(stu);
		}
		
		List<Student> stuList = new ArrayList<Student>();
		for (int i = 0; i < st.size(); i++) {
			stu = st.get(i);
			String sq = "select sum(ANSWERSCORE) from STUQUESTIONSCORE where UNITID=? and STUID=?";
			Object param1[] = {unitId,stu.getStuId()};
			ResultSet rs1 = this.getRs(conn, sq, param1);
			if(rs1.next()){
				int totalScore = rs1.getInt(1);
				stu.setTotalScore(totalScore);
				stuList.add(stu);
			}
		}
		
		return stuList;
	}

	@Override
	public List<Unit> findSingleStuScore(Connection conn, String stuId)
			throws Exception {
		
		UnitDao unitDao = new UnitDaoImpl();
		List<Unit> ut = unitDao.findAllUnit(conn);
		
		
		List<Unit> unitList = new ArrayList<Unit>();
		for (int i = 0; i < ut.size(); i++) {
			Unit unit = ut.get(i);
			String sql = "select sum(ANSWERSCORE) from STUQUESTIONSCORE where UNITID=? and STUID=?" +
					" and (select sum(ANSWERSCORE) from STUQUESTIONSCORE where UNITID=? and STUID=?)<>0";
			Object param[] = {unit.getUnitId(),stuId,unit.getUnitId(),stuId};
			ResultSet rs = this.getRs(conn, sql, param);
			if(rs.next()){
				unit.setScore(rs.getInt(1));
				unitList.add(unit);
			}
		}
		
		return unitList;
	}

	
}
