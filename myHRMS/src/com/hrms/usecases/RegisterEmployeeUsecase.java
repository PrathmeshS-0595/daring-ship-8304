package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.Application.AdminLink;
import com.hrms.Application.Main;
import com.hrms.bean.Employee;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class RegisterEmployeeUsecase {
public static void registerEmployee() {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println();
		System.out.println("<------------------ Employee Registration Page ------------------>");
		System.out.println();
		
		System.out.println("Enter Emp Name :");
		String Ename=sc.next();
		
		System.out.println("Enter Emp Username : ");
		String Username=sc.next();
		
		System.out.println("Enter Emp Password : ");
		String pass = sc.next();
		
		System.out.println("Enter Emp Department Id : ");
		int Edid=sc.nextInt();
		
		
		EmployeeDao dao =new EmployeeDaoImpl();
		
		Employee employee = new Employee();
		employee.setEname(Ename);
		employee.setUsername(Username);
		employee.setPassword(pass);
		employee.setEdid(Edid);
		
		String result =dao.registerEmployee(employee);
		
		System.out.println(result);
		
		System.out.println();
		System.out.println("<-- Press 1 for Main page / Press 2 for Admin page -->");
		System.out.println();
        int choice =sc.nextInt();
		
		switch (choice) {
		
		case 1: {
			
		Main.main(null);
			break;
			
		}
		case 2: {
			
			AdminLink.linkingAdmin();
				break;
				
			}
		
		
	}
	
}
}
