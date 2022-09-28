package com.first.exapmle.pro.Test.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.first.exapmle.pro.Test.entity.Student;
import com.first.exapmle.pro.Test.service.StudenService;

@RestController
public class Studentcontroller {

	@Autowired
	StudenService service;
	
	@GetMapping("/student")
	private List<Student> getAll(){
		
		return service.getAll();
		
	}
	@GetMapping("/student/{studentid}")
	private Student getstudent (@PathVariable("studentid") int id) {
		return service.getstudentById(id);
		
	}
	@DeleteMapping("/student/{studentid}")
	private void deleteStudent(@PathVariable("studentid")int id) {
		service.delete(id);
	}
	@PostMapping("/students")
	private int saveStudent(@RequestBody Student student) {
		service.saveOrUpdate(student);
		return student.getId();
		
	}
	@PutMapping("/students")  
	private Student update(@RequestBody Student books)   
	{  
	service.saveOrUpdate(books);  
	return books;  
	} 
	
}
