package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.bean.Employee;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class UpdatepasswordEmpUsecase {
	public static void changePassword() {

		Scanner sc =new Scanner(System.in);
		System.out.println();
		System.out.println("<-------- Password Update Page --------> ");
		System.out.println();
		System.out.println();
		
		System.out.println("Enter New Password : ");
		String pass= sc.next();
		
		System.out.println("Enter Employee ID : ");
		int eid=sc.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		Employee employee = new Employee();
		
		employee.setPassword(pass);
		employee.setEid(eid);
		
		String rs = dao.changePassword(eid);
		
		System.out.println(rs);
	}

}
