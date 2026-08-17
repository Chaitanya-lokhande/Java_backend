package com.springcore.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.springjdbc.dao.StudentDaoImple;

@Configuration
public class JavaConfig {
	@Bean("dataSource")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("Alliswell@2001");
		return dataSource;
	}
	
	@Bean("jdbctemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbctemplate = new JdbcTemplate(getDataSource());
		return jdbctemplate;
	}
	
	@Bean("studentDaoImple")
	public StudentDaoImple getStudentDaoImple() {
		StudentDaoImple studentDaoImple = new StudentDaoImple();
		studentDaoImple.setJdbcTemplate(getTemplate());
		
		return studentDaoImple;
	}
}
