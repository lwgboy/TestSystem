package com.pro.service;


import java.util.List;

import com.pro.domain.Student;
import com.pro.domain.Unit;

public interface StudentService {

	public void addStudent(Student student);
	public void deleteStudent(int studentId);
	public void updateStudent(Student student);
	public Student findStudentSingle(Student student);
	public List<Student> findStudentAll();
	public Student findOne(String stuId);
	
	//按unitID查 所有学生成绩
	public List<Student> findStuGetScore(String unitId);
	
	//按stuId 查单个学生的所有unit 成绩
	public List<Unit> findSingleStuScore(String stuId);
}
