package com.pro.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pro.domain.Student;

public class StudentDaoImpl extends BaseDao implements StudentDao{

	@Override
	public void addStudent(Connection conn, Student student) throws Exception {

		String sql = "insert into student(stuID,stuName,stuPwd) values(?,?,?)";
		Object param[] = {student.getStuId(),student.getStuName(),student.getStuPwd()};
		this.exeSql(conn, sql, param);
	}

	@Override
	public void deleteStudent(Connection conn, int studentId) throws Exception {
		
		String sql = "delete from student where stuId=?";
		Object param[] = {studentId};
		this.exeSql(conn, sql, param);
	}

	@Override
	public List<Student> findStudentAll(Connection conn) throws Exception {
		
		String sql = "select * from student order by stuId";
		Object param[] = {};
		List<Student> stuList = new ArrayList<Student>();
		ResultSet rs = this.getRs(conn, sql, param);
		while(rs.next()){
			Student stu = new Student();
			stu.setStuId(rs.getString("stuId"));
			stu.setStuName(rs.getString("stuName"));
			stu.setStuPwd(rs.getString("stuPwd"));
			stuList.add(stu);
		}
		return stuList;
	}

	@Override
	public Student findStudentSingle(Connection conn, Student student)
			throws Exception {

		String sql = "select * from student where stuId=? and stuPwd=?";
		Object param[] = {student.getStuId(),student.getStuPwd()};
		Student stu = null;
		ResultSet rs = this.getRs(conn, sql, param);
		if(rs.next()){
			stu = new Student();
			stu.setStuId(rs.getString("stuId"));
			stu.setStuName(rs.getString("stuName"));
			stu.setStuPwd(rs.getString("stuPwd"));
		}
		return stu;
	}

	@Override
	public void updateStudent(Connection conn, Student student)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student findOne(Connection conn, String stuId) throws Exception {
		String sql = "select * from student where stuId=?";
		Object param[] = {stuId};
		Student stu = null;
		ResultSet rs = this.getRs(conn, sql, param);
		if(rs.next()){
			stu = new Student();
			stu.setStuId(rs.getString("stuId"));
			stu.setStuName(rs.getString("stuName"));
			stu.setStuPwd(rs.getString("stuPwd"));
		}
		return stu;
	}

	

}
