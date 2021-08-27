package com.model;

public class College {
	private int collegeId;
	private String collegeName;
	private Department[] department;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int collegeId, String collegeName, Department[] department) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.department = department;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Department[] getDepartment() {
		return department;
	}
	public void setDepartment(Department[] department) {
		this.department = department;
	}
	
	

}
