package com.pro.service;

import java.sql.Connection;
import java.util.List;

import com.pro.dao.StuQuestionScoreDao;
import com.pro.dao.StuQuestionScoreDaoImpl;
import com.pro.domain.StuQuestionScore;
import com.pro.util.DbHelper;

public class StuQuestionScoreServiceImpl implements StuQuestionScoreService {

	@Override
	public void addStuQS(StuQuestionScore sqs) {

		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			StuQuestionScoreDao stuQuestionScoreDao = new StuQuestionScoreDaoImpl();
			stuQuestionScoreDao.addStuQS(conn, sqs);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public StuQuestionScore findStuQSSingle(String stuId,String unitId) {
		
		Connection conn = null;
		StuQuestionScore stuQuestionScore = null;
		
		try {
			conn = DbHelper.getConn();
			StuQuestionScoreDao stuQuestionScoreDao = new StuQuestionScoreDaoImpl();
			stuQuestionScore = stuQuestionScoreDao.findStuQSSingle(conn, stuId, unitId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return stuQuestionScore;
	}

	@Override
	public void updateStuQS(StuQuestionScore sqs) {
		

		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			StuQuestionScoreDao stuQuestionScoreDao = new StuQuestionScoreDaoImpl();
			stuQuestionScoreDao.updateStuQS(conn, sqs);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<StuQuestionScore> getStuQuestionScoreList(String unitId,
			String stuId) {
		Connection conn = null;
		List<StuQuestionScore> stuQuestionScoreList = null;
		try {
			conn = DbHelper.getConn();
			StuQuestionScoreDao stuQuestionScoreDao = new StuQuestionScoreDaoImpl();
			stuQuestionScoreList = stuQuestionScoreDao.getStuQuestionScoreList(conn, unitId, stuId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return stuQuestionScoreList;
	}

	@Override
	public void update_stuQuestionScore_answerValue(String unitId,
			String stuId, int questionId, String answerValue) {
		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			StuQuestionScoreDao stuQuestionScoreDao = new StuQuestionScoreDaoImpl();
			stuQuestionScoreDao.update_stuQuestionScore_answerValue(conn, unitId, stuId, questionId, answerValue);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	
	}

}
