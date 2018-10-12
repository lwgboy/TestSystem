package com.pro.service;

import java.sql.Connection;

import com.pro.dao.TeacherDao;
import com.pro.dao.TeacherDaoImpl;
import com.pro.domain.Teacher;
import com.pro.util.DbHelper;

public class TeacherServiceImpl implements TeacherService {

	@Override
	public int addTeacher(Teacher teacher) {
		Connection conn = null;
		int n = 0;
		try {
			conn = DbHelper.getConn();
			TeacherDao teacherDao = new TeacherDaoImpl();
			teacherDao.insertTea(conn, teacher);
			n = 1;
		} catch (Exception e) {
			n = 0;
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				n = 0;
				e.printStackTrace();
			}
		}
		
		return n;
	}

	@Override
	public int deleteTeacher(int teaId) {
		Connection conn = null;
		int n = 0;
		try {
			conn = DbHelper.getConn();
			TeacherDao teacherDao = new TeacherDaoImpl();
			teacherDao.deleteTea(conn, teaId);
			n = 1;
		} catch (Exception e) {
			n = 0;
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				n = 0;
				e.printStackTrace();
			}
		}
		
		return n;
	}

	@Override
	public Teacher getTea(int teaId, String teaPwd) {
		Connection conn = null;
		Teacher teacher = null;
		try {
			conn = DbHelper.getConn();
			TeacherDao teacherDao = new TeacherDaoImpl();
			teacher = teacherDao.getTea(conn, teaId, teaPwd);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return teacher;
	}

}
