package com.pro.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pro.dao.UnitQuestionScoreDao;
import com.pro.dao.UnitQuestionScoreDaoImpl;
import com.pro.domain.Question;
import com.pro.domain.UnitQuestionScore;
import com.pro.util.DbHelper;

public class UnitQuestionScoreServiceImpl implements UnitQuestionScoreService {

	@Override
	public void insertUnitQuestionScore(UnitQuestionScore unitQuestionScore) {
		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			UnitQuestionScoreDao unitQuestionScoreDao = new UnitQuestionScoreDaoImpl();
			unitQuestionScoreDao.insertUnitQuestionScore(conn, unitQuestionScore);
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
	public Map<String,Object> findUnitQuestionScore(String unitId) {
		Connection conn = null;
		List<Question> questionList = new ArrayList<Question>();
		Map<String,Object> maps = new HashMap<String,Object>();
		try {
			conn = DbHelper.getConn();
			UnitQuestionScoreDao unitQuestionDao = new UnitQuestionScoreDaoImpl();
			maps = unitQuestionDao.findUnitQuestionScore(conn, unitId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return maps;
	}
		
	

}
