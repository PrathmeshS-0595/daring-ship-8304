package com.hrms.usecases;

import java.util.List;

import com.hrms.Exception.EmployeeException;
import com.hrms.bean.Employee;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class GetAllEmployeeUsecase {
public static void main(String[] args) {
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			
		List<Employee> emp	=dao.allEmployeeDetails();
		
		emp.forEach(e->{
			System.out.println("Employee Id is : "+ e.getEid());
			System.out.println("Employe Name is : "+e.getEname());
			System.out.println("Employee Username is : "+e.getUsername());
			System.out.println("Employee Department Id is "+e.getEdid());
			
			System.out.println("=====================================");
		});
		
		
		
		} catch (EmployeeException e) {
		
			System.out.println(e.getMessage());
		}
	}


}
