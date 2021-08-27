package com.model;

public class Department {
	private int deptId;
	private String deptname;
	private Student[] student;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptId, String deptname, Student[] student) {
		super();
		this.deptId = deptId;
		this.deptname = deptname;
		this.student = student;
	}
	
	public Department(int deptId, String deptname) {
		super();
		this.deptId = deptId;
		this.deptname = deptname;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Student[] getStudent() {
		return student;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}
	

}
