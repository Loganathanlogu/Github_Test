package com.first.exapmle.pro.Test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.exapmle.pro.Test.entity.Student;
import com.first.exapmle.pro.Test.repository.Studentrepo;

@Service
public class StudenService {
	@Autowired
	Studentrepo studentrepo;
	public List<Student> getAll(){
		List<Student> student= new ArrayList<Student>();
		studentrepo.findAll().forEach(student1 ->student.add(student1));
		return student;
		
	}
	public Student getstudentById(int id)   
	{  
	return studentrepo.findById(id).get();  
	} 
	public void saveOrUpdate(Student student)   
	{  
		studentrepo.save(student);  
	}
	public void delete(int id)   
	{  
		studentrepo.deleteById(id);  
	}  
	//updating a record  
	public void update(Student name, int bookid)   
	{  
		studentrepo.save(name);  
	}

}
