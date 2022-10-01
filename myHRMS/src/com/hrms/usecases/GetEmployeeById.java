package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.Exception.EmployeeException;
import com.hrms.bean.Employee;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class GetEmployeeById {


		public static void viewEmployById() {
		
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("<-------- Employee Details Page --------> ");
			System.out.println();
			System.out.println();
			
			System.out.println("Enter Employee Id : ");
			int eid=sc.nextInt();
			
			EmployeeDao dao= new EmployeeDaoImpl();
			
			try {
				
				Employee employee = dao.getEmployeeById(eid);
				System.out.println(employee);
				
				
			} catch (EmployeeException se) {
				System.out.println(se.getMessage());
			}
		
		}

}
