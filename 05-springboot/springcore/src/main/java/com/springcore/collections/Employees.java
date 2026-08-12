package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employees {
	private String empName;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpMob() {
		return empMob;
	}
	public void setEmpMob(List<String> empMob) {
		this.empMob = empMob;
	}
	public Set<String> getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(Set<String> empAdd) {
		this.empAdd = empAdd;
	}
	public Map<String, String> getEmpCourses() {
		return empCourses;
	}
	public void setEmpCourses(Map<String, String> empCourses) {
		this.empCourses = empCourses;
	}
	private List<String> empMob;
	private Set<String> empAdd;
	private Map<String, String> empCourses;
	public Employees(String empName, List<String> empMob, Set<String> empAdd, Map<String, String> empCourses) {
		super();
		this.empName = empName;
		this.empMob = empMob;
		this.empAdd = empAdd;
		this.empCourses = empCourses;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employees [empName=" + empName + ", empMob=" + empMob + ", empAdd=" + empAdd + ", empCourses="
				+ empCourses + "]";
	}
	
}
