package com.first.exapmle.pro.Test.repository;

import org.springframework.data.repository.CrudRepository;

import com.first.exapmle.pro.Test.entity.Student;

public interface Studentrepo extends CrudRepository<Student,Integer>{

}
