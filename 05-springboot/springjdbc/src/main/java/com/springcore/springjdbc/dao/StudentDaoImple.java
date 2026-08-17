package com.springcore.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.springjdbc.entities.Student;

public class StudentDaoImple implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		String query="insert into student(id,name,city) values(?,?,?)";
		int result = this.jdbcTemplate.update(query,student.getId(),student.getName(), student.getCity());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int change(Student student) {
		String query="update student set name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

	@Override
	public int delete(int studentId) {
		String query="delete from student where id=?";
		int result = this.jdbcTemplate.update(query,studentId);
		return result;
	}


}
