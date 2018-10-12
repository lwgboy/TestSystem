package com.pro.service;


import java.util.List;

import com.pro.domain.StuQuestionScore;

public interface StuQuestionScoreService {

	public void addStuQS(StuQuestionScore sqs);
	public void updateStuQS(StuQuestionScore sqs);
	public StuQuestionScore findStuQSSingle(String stuId,String unitId);
	
	//cjf
	public List<StuQuestionScore> getStuQuestionScoreList(String unitId,String stuId);
	
	//cjf
	public void update_stuQuestionScore_answerValue(String unitId,String stuId,int questionId,String answerValue);
}
