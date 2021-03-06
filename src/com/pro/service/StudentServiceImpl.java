package com.pro.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.pro.dao.StuQuestionScoreDao;
import com.pro.dao.StuQuestionScoreDaoImpl;
import com.pro.dao.StudentDao;
import com.pro.dao.StudentDaoImpl;
import com.pro.domain.Student;
import com.pro.domain.Unit;
import com.pro.util.DbHelper;

public class StudentServiceImpl implements StudentService {

	@Override
	public void addStudent(Student student) {

		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			StudentDao studentDao = new StudentDaoImpl();
			studentDao.addStudent(conn, student);
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
	public void deleteStudent(int studentId) {

		Connection conn = null;
		
		try {
			conn = DbHelper.getConn();
			StudentDao studentDao = new StudentDaoImpl();
			studentDao.deleteStudent(conn, studentId);
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
	public List<Student> findStudentAll() {

		Connection conn = null;
		List<Student> stuList = new ArrayList<Student>();
		
		try {
			conn = DbHelper.getConn();
			StudentDao studentDao = new StudentDaoImpl();
			stuList = studentDao.findStudentAll(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return stuList;
	}

	@Override
	public Student findStudentSingle(Student student) {

		Connection conn = null;
		Student stu = null;
		
		try {
			conn = DbHelper.getConn();
			StudentDao studentDao = new StudentDaoImpl();
			stu = studentDao.findStudentSingle(conn, student);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return stu;
	}

	@Override
	public void updateStudent(Student student) {
		
	}

	@Override
	public Student findOne(String stuId) {
		Connection conn = null;
		Student stu = null;
		
		try {
			conn = DbHelper.getConn();
			StudentDao studentDao = new StudentDaoImpl();
			stu = studentDao.findOne(conn, stuId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return stu;
	}

	@Override
	public List<Student> findStuGetScore(String unitId) {
		
		Connection conn = null;
		List<Student> stuList = new ArrayList<Student>();
		
		try {
			conn = DbHelper.getConn();
			StuQuestionScoreDao stuQuestionScoreDao = new StuQuestionScoreDaoImpl();
			stuList = stuQuestionScoreDao.findStuGetScore(conn,unitId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				DbHelper.closeAll(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return stuList;
	}

	@Override
	public List<Unit> findSingleStuScore(String stuId) {
		
		Connection conn = null;
		List<Unit> unitList = new ArrayList<Unit>();
		
		try {
			conn = DbHelper.getConn();
			StuQuestionScoreDao stuQuestionScoreDao = new StuQuestionScoreDaoImpl();
			unitList = stuQuestionScoreDao.findSingleStuScore(conn,stuId);
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

}
