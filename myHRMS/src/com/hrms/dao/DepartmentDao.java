package com.hrms.dao;

import java.util.List;

import com.hrms.Exception.DepartmentException;
import com.hrms.bean.Department;

public interface DepartmentDao {
	public String registerDepartment(Department Department);
	
	 public List<Department> allDepartment()throws DepartmentException;
	 
	 public String updateDepartment(Department department);

}
