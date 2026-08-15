package com.springcore.javaconfig;

public class Student {
	private Samosa samosa;
	public void study() {
		System.out.println("Student is reading book..");
		this.samosa.display();
	}
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}