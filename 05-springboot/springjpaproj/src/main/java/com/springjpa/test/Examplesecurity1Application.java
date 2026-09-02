package com.springjpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springjpa.test.dao.UserRepository;
import com.springjpa.test.entity.Student;

@SpringBootApplication
public class Examplesecurity1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Examplesecurity1Application.class, args);
		
		UserRepository userRepo = context.getBean(UserRepository.class);
		
		Student student1 = new Student();
		student1.setStudentName("Chaitanya Lokhande");
		student1.setStudentCity("Ahmednagar");
		Student student = userRepo.save(student1);
		System.out.println(student);
		
	}

}
