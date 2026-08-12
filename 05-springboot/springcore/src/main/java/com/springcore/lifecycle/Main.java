package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		Samosa samosa1 = (Samosa)context.getBean("samosa1");
		System.out.println(samosa1);
		context.registerShutdownHook();
		
		Manager manager1 = (Manager)context.getBean("manager");
		System.out.println(manager1);
	}

}
