package com.service;

import com.model.Department;
import com.model.Student;

public interface UniversityService {
	public abstract Student displayStudents(Department department, int id);
}
