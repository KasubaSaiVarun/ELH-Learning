package com.service;


import com.model.Department;
import com.model.Student;

public class UniversityServiceImpl implements UniversityService {

	@Override
	public Student displayStudents(Department department,int id) {
		Student studentDetails=null;
		Student[] studentArray= department.getStudent();
	
		for (int i = 0; i < studentArray.length; i++) {
			if(studentArray[i].getStudId()==id)
			{
				studentDetails=studentArray[i];
			}
			else
			{
				
			}
		}
		return studentDetails;
		
	}

}
