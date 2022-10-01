package com.hrms.dao;

import java.util.List;

import com.hrms.Exception.EmployeeException;
import com.hrms.bean.Employee;

public interface EmployeeDao {
	public String registerEmployee(Employee Employee);
	
	public Employee getEmployeeById(int Eid) throws EmployeeException;
	
    public Employee loginEmployee(String Username , String password) throws EmployeeException;
    
    public List<Employee> allEmployeeDetails()throws EmployeeException;
    
    public String changePassword(int Eid);
    
    public String updateEmployee(Employee employee, int Eid);
    
    public String changeDepartment(int Eid,int Edid);
    
    public String applyLeave(int empId, String status);
    
    public String acceptLeaves(int empId);
    
    public String rejectLeaves(int empId);
    
   

}
