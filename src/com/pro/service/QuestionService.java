package com.pro.service;

import java.util.List;
import com.pro.domain.Question;
import com.pro.util.PageModel;

public interface QuestionService {
	
	public void save(Question question);
	
	public void remove(int questionId);
	
	public void update(Question question);
	
	public Question findtOne(int questionId);
	
	public List<Question> findAll();
	
	public PageModel<Question> findPage(int currentPage , int pageSize);
}
