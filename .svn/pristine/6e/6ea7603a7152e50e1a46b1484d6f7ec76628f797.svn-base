package com.pro.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.pro.domain.Unit;
import com.pro.util.PageModel;

public class UnitDaoImpl extends BaseDao implements UnitDao {

	@Override
	public void insertUnit(Connection conn,Unit unit) throws Exception {
		String sql  = "insert into unit(unitId,unitName,unitFlag) values(?,?,?)";
		Object[] param = {unit.getUnitId(),unit.getUnitName(),unit.getUnitFlag()};
		this.exeSql(conn, sql, param);	
	}

	/*
	 * 只需要一个UNitId
	 * (non-Javadoc)
	 * @see com.pro.dao.UnitDao#findAllUnit(java.sql.Connection)
	 */
	@Override
	public List<Unit> findAllUnit(Connection conn) throws Exception {
		
		String sql = "select * from unit";
		Object param[] = {};
		List<Unit> unitList = new ArrayList<Unit>();
		ResultSet rs = this.getRs(conn, sql, param);
		while(rs.next()){
			Unit u = new Unit();
			u.setUnitId(rs.getString("unitId"));
			u.setUnitName(rs.getString("unitName"));
			u.setUnitFlag(rs.getInt("unitFlag"));
			unitList.add(u);
		}
		
		return unitList;
	}


	@Override
	public Unit findSingleUnit(Connection conn, String unitId) throws Exception {
		
		String sql = "select * from unit where unitId=?";
		Object param[] = {unitId};
		Unit unit = null;
		ResultSet rs = this.getRs(conn, sql, param);
		if(rs.next()){
			unit = new Unit();
			unit.setUnitId(rs.getString("unitId"));
			unit.setUnitName(rs.getString("unitName"));
			unit.setUnitFlag(rs.getInt("unitFlag"));
		}
		return unit;
	}


	@Override 
	public PageModel<Unit> findPageUnit(Connection conn, int currentPage, int pageSize) throws Exception {
		String sql = "select * from (select rownum rn,e.* from (select * from unit order by unitId) e where rownum<=? ) where rn>?";
		Object param[] = {currentPage*pageSize,(currentPage-1)*pageSize};
		List<Unit> unitList = new ArrayList<Unit>();
		ResultSet rs = this.getRs(conn, sql, param);
		while(rs.next()){
			Unit u = new Unit();
			u.setUnitId(rs.getString("unitId"));
			u.setUnitName(rs.getString("unitName")); 
			unitList.add(u);
		}
		
		PageModel<Unit> pagemodel = new PageModel<Unit>();
		pagemodel.setList(unitList);
		pagemodel.setCurrentPage(currentPage);
		pagemodel.setPageSize(pageSize);
		pagemodel.setTotalRecord(this.getTotalRecord(conn,"select count(*) from unit", null));
			
		return pagemodel;
	}

	@Override
	public void deleteUnit(Connection conn, String unitId) throws Exception {
		String sql = "delete from unit where unitId=?";
		Object[] param = {unitId};
		this.exeSql(conn, sql, param);
	}

	@Override
	public void updateUnit(Connection conn, Unit unit) throws Exception {
		String sql = "update set unitName=?,unitFlag=? where unitId=?";
		Object[] param = {unit.getUnitName(),unit.getUnitFlag(),unit.getUnitId()};
		this.exeSql(conn, sql, param);
	}

}







