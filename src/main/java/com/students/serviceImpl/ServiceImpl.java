package com.students.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.entity.Student;
import com.students.repository.Studentrepositary;
import com.students.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	Studentrepositary  Studentrepositary;
	
	public List<Student> getAllStudents(){
		
		List<Student> list = Studentrepositary.findAll();
		return list;
		
	}
	
}
