package com.pro.dao;

import java.sql.Connection;
import java.util.List;

import com.pro.domain.Question;
import com.pro.util.PageModel;

public interface QuestionDao {
	public void insert(Connection conn,Question question) throws Exception;
	
	public void delete(Connection conn,int questionId) throws Exception;
	
	public void update(Connection conn,Question question) throws Exception;
	
	public Question selectOne(Connection conn,int questionId) throws Exception;
	
	public List<Question> selectAll(Connection conn) throws Exception;
	
	public PageModel<Question> selectPage(Connection conn , int currentPage , int pageSize) throws Exception;
}
