package com.cg.client;

import com.cg.Entity.Student;
import com.cg.service.StudentSerivceImpl;
import com.cg.service.StudentService;

public class Client {

	public static void main(String[] args) {
		
		StudentService service = new StudentSerivceImpl();

		Student student = new Student();
		
		// Create Operation
		student.setStudentId(100);
		student.setName("Haarish");
		service.addStudent(student);
		System.out.println("Data is added successfully");
		
		// Retrieve operation
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		
		// Update Operation
		student = service.findStudentById(100);
		student.setName("Haarish R");
		service.updateStudent(student);
		System.out.println("Data is upadated successfully");
		
		// Delete Operation
		student = service.findStudentById(100);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");
	}

}
