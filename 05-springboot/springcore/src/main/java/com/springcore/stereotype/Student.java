package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Component("studentClass")
public class Student {
	@Value("Chaitanya")
	private String name;
	@Value("20")
	private int rollNo;
	@Value("#{temp}")
	private List<String> address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", address=" + address + "]";
	}
	
	
	
}
