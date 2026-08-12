package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Manager {
	private String employeeCount;

	public String getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(String employeeCount) {
		this.employeeCount = employeeCount;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manager [employeeCount=" + employeeCount + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method...");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending method...");
	}
}
