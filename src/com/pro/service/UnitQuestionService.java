package com.pro.service;

import java.util.List;

import com.pro.domain.Question;
import com.pro.domain.UnitQuestion;

public interface UnitQuestionService {
	
	public void insertUnitQuestion(UnitQuestion unitQuestion);

	
	public List<Question> selectUnitQuestion(String unitId);


	
	public List<Question> getAllUnitQuestion(String unitId);

}
