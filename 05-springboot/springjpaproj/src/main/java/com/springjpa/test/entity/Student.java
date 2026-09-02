package com.springjpa.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	private String studentName;
	private String studentCity;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", studentCity=" + studentCity + "]";
	}

	public Student(int rollNo, String studentName, String studentCity) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}


}
