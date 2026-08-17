package com.springcore.springjdbc.dao;

import com.springcore.springjdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
}
