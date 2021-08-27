package com.main;

import java.util.Scanner;

import com.model.Department;
import com.model.Student;
import com.service.UniversityService;
import com.service.UniversityServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Id : ");
		int idNo = scan.nextInt();
		Student student1 = new Student(11, "sai", 21);
		Student student2 = new Student(21, "varun", 22);
		Student student3 = new Student(22, "saivarun", 23);
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		Department department2 = new Department();
		department2.setStudent(students);
		UniversityService universityService = new UniversityServiceImpl();
		Department department = new Department();
		department.setDeptId(1001);
		department.setDeptname("IT");
		Department department1 = new Department();
		department1.setDeptId(1002);
		department1.setDeptname("CSE");
		Student details = universityService.displayStudents(department2, idNo);
		
		if(details.getStudId()>=11 && details.getStudId()<=20)
		{
			System.out.println("Department Id is : "+department.getDeptId());
			System.out.println("Department name is : "+department.getDeptname());
			System.out.println("The Id Number of the Student is : "+details.getStudId());
			System.out.println("The Name of the Student is : "+details.getStudName());
			System.out.println("The Age of the Student is : "+details.getAge());
		}
		if(details.getStudId()>=21 && details.getStudId()<=30)
		{
			System.out.println("Department Id is : "+department1.getDeptId());
			System.out.println("Department name is : "+department1.getDeptname());
			System.out.println("The Id Number of the Student is : "+details.getStudId());
			System.out.println("The Name of the Student is : "+details.getStudName());
			System.out.println("The Age of the Student is : "+details.getAge());
		}
	
		
			
		}
		
		
		

	

}
