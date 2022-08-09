package com.cg.service;

import com.cg.Entity.Student;
import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;

public class StudentSerivceImpl implements StudentService{
	
	private StudentDao dao;
	public StudentSerivceImpl()
	{
	dao = new StudentDaoImpl();
	}
	

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}

	@Override
	public Student findStudentById(int id) {
		Student student = dao.getStudentById(id);
		return student;
	}

}
