package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/config.xml");
		Employees emp1 = (Employees)context.getBean("emp1");
		System.out.println(emp1);

	}

}
