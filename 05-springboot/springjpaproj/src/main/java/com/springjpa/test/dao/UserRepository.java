package com.springjpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.test.entity.Student;

public interface UserRepository extends CrudRepository<Student, Integer>{

	
}
