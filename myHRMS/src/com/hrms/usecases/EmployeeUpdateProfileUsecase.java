package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.bean.Employee;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class EmployeeUpdateProfileUsecase {
	public static void updateProfile() {

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("<-------- Employee Profile Update Page --------> ");
		System.out.println();
		System.out.println();
		
		System.out.println("Enter Name : ");
		String Ename=sc.next();
		
		System.out.println("Enter Username  : ");
		String username=sc.next();
		
		System.out.println("Enter Password  : ");
		String pass=sc.next();
		
		
		System.out.println("Enter Employee Id  : ");
		int eid=sc.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		Employee employee = new Employee();
		
		employee.setEname(Ename);
		employee.setUsername(username);
		employee.setPassword(pass);
		employee.setEid(eid);
		
		String result = dao.updateEmployee(employee, eid);
	
		System.out.println(result);
	}

}
