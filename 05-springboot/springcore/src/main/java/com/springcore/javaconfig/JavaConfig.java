package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Student getStudent() {
		//creating a new student object
		Student student = new Student(getSamosa());
		return student;
	}
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
}
