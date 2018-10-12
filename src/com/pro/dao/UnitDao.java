package com.pro.dao;

import java.sql.Connection;
import java.util.List;

import com.pro.domain.Unit;
import com.pro.util.PageModel;

public interface UnitDao {
	
	public void insertUnit(Connection conn,Unit unit)throws Exception;
	public List<Unit> findAllUnit(Connection conn)throws Exception;
	public Unit findSingleUnit(Connection conn,String unitId)throws Exception;
	public PageModel<Unit> findPageUnit(Connection conn,int currentPage,int pageSize)throws Exception;
	public void deleteUnit(Connection conn,String unitId)throws Exception;
	public void updateUnit(Connection conn,Unit unit)throws Exception;

}
 