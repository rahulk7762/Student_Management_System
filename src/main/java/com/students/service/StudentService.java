package com.students.service;



import java.util.List;

import com.students.entity.Student;

public interface StudentService {

	
	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student getById(int id);
	
}
