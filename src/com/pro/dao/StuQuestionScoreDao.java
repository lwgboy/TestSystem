package com.pro.dao;

import java.sql.Connection;
import java.util.List;

import com.pro.domain.StuQuestionScore;
import com.pro.domain.Student;
import com.pro.domain.Unit;
import com.pro.util.PageModel;

public interface StuQuestionScoreDao {

	public void addStuQS(Connection conn,StuQuestionScore sqs) throws Exception;
	
	public void updateStuQS(Connection conn,StuQuestionScore sqs) throws Exception;
	
	public List<StuQuestionScoreDao> findStuQSAll(Connection conn,StuQuestionScore sqs) throws Exception;
	
	public PageModel<StuQuestionScoreDao> findStuQSPage(Connection conn,StuQuestionScore sqs) throws Exception;
	
	//查单个
	public StuQuestionScore findStuQSSingle(Connection conn,String stuId,String unitId) throws Exception;
	
	//教师查询学生答案分数表进行批改
	public List<StuQuestionScore> getStuQuestionScoreList(Connection conn,String unitId,String stuId)throws Exception;
	

	//cjf:学生修改答案
	public void update_stuQuestionScore_answerValue(Connection conn,String unitId,String stuId,int questionId,String answerValue)throws Exception;
	

	//按单元查个个学生的分数
	public List<Student> findStuGetScore(Connection conn,String unitId) throws Exception;

	//按stuId 查单个学生的所有unit 成绩
	public List<Unit> findSingleStuScore(Connection conn, String stuId) throws Exception;
	
}
