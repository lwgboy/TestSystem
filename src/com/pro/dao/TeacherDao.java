package com.pro.dao;

import java.sql.Connection;

import com.pro.domain.Teacher;

public interface TeacherDao {
	
	public void insertTea(Connection conn,Teacher teacher)throws Exception;
	
	public void deleteTea(Connection conn,int teaId)throws Exception;
	
	public Teacher getTea(Connection conn,int teaId , String teaPwd) throws Exception;

}
