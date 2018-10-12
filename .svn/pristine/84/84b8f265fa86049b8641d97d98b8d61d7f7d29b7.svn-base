package com.pro.service;

import java.sql.Connection;
import java.util.List;

import com.pro.dao.QuestionDao;
import com.pro.dao.QuestionDaoImpl;
import com.pro.domain.Question;
import com.pro.util.DbHelper;
import com.pro.util.PageModel;

public class QuestionServiceImpl implements QuestionService {

	@Override
	public List<Question> findAll() {
		Connection conn = null;
		List<Question> questionList = null;
		
		try {
			conn = DbHelper.getConn();
			QuestionDao questionDao = new QuestionDaoImpl();
			questionList = questionDao.selectAll(conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return questionList;
	}

	@Override
	public PageModel<Question> findPage(int currentPage, int pageSize) {
		Connection conn = null;
		PageModel<Question> pageModel = null;
		
		try {
			conn = DbHelper.getConn();
			QuestionDao questionDao = new QuestionDaoImpl();
			pageModel = questionDao.selectPage(conn, currentPage, pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return pageModel;
	}

	@Override
	public Question findtOne(int questionId) {
		Connection conn = null;
		Question question = new Question();
		
		try {
			conn = DbHelper.getConn();
			QuestionDao questionDao = new QuestionDaoImpl();
			question = questionDao.selectOne(conn, questionId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return question;
	}

	@Override
	public void remove(int questionId) {
		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			QuestionDao questionDao = new QuestionDaoImpl();
			questionDao.delete(conn, questionId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void save(Question question) {
		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			QuestionDao questionDao = new QuestionDaoImpl();
			questionDao.insert(conn, question);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void update(Question question) {
		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			QuestionDao questionDao = new QuestionDaoImpl();
			questionDao.update(conn, question);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
