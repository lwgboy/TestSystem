package com.pro.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.pro.dao.UnitDao;
import com.pro.dao.UnitDaoImpl;
import com.pro.domain.Unit;
import com.pro.util.DbHelper;
import com.pro.util.PageModel;

public class UnitServiceImpl implements UnitService {

	@Override
	public void insertUnit(Unit unit) {
		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			UnitDao unitDao = new UnitDaoImpl();
			unitDao.insertUnit(conn, unit);
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
	public List<Unit> findAllUnit() {
		
		Connection conn = null;
		List<Unit> unitList = new ArrayList<Unit>();
		
		try {
			conn = DbHelper.getConn();
			UnitDao unitDao = new UnitDaoImpl();
			unitList = unitDao.findAllUnit(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return unitList;
	}

	@Override
	public Unit findSingleUnit(String unitId) {
		
		Connection conn = null;
		Unit unit = new Unit();
		
		try {
			conn = DbHelper.getConn();
			UnitDao unitDao = new UnitDaoImpl();
			unit = unitDao.findSingleUnit(conn, unitId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return unit;
	}
	
	

	@Override
	public PageModel<Unit> findPageUnit(int currentPage, int pageSize) {
		Connection conn = null;
		PageModel<Unit> pageModel = new PageModel<Unit>();
		
		try {
			conn = DbHelper.getConn();
			UnitDao unitDao = new UnitDaoImpl();
			pageModel = unitDao.findPageUnit(conn, currentPage, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{ 
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pageModel;
	}

	@Override
	public void deleteUnit(String unitId) {

		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			UnitDao unitDao = new UnitDaoImpl();
			unitDao.deleteUnit(conn, unitId);
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
	public void updatetUnit(Unit unit) {
Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			UnitDao unitDao = new UnitDaoImpl();
			unitDao.updateUnit(conn, unit);
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
