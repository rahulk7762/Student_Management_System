package com.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.students.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/students")
	public String getAllStudents(Model model) {
		model.addAttribute("students",service.getAllStudents());
		
		return "students";
	}
	
}
