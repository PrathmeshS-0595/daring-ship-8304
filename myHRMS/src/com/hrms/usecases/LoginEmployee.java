package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.Application.EmployeeLink;
import com.hrms.Application.Main;
import com.hrms.Exception.EmployeeException;
import com.hrms.bean.Employee;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class LoginEmployee {
		
		public static void loginEmployee() {
			

			Scanner sc =new Scanner(System.in);
			System.out.println();
			System.out.println("<-------- Employee Login Page --------> ");
			System.out.println();
			System.out.println();
			
			System.out.println("Enter Username : ");
			String username=sc.next();
			
			System.out.println("Enter Password : ");
			String pass = sc.next();
			
			EmployeeDao dao=new EmployeeDaoImpl();
			
			
			try {
				Employee employee = dao.loginEmployee(username, pass) ;
				System.out.println("Welcome : "+employee.getEname());
				EmployeeLink.linkingEmployeeMethod();
						
			} catch (EmployeeException e) {
				System.out.println("No Emoloyee Registered with this Email and Password");
				Main.main(null);
			}
		}

}
