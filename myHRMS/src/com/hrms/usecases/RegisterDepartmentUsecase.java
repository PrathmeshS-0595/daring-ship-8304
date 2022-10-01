package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.Application.AdminLink;
import com.hrms.Application.Main;
import com.hrms.bean.Department;
import com.hrms.dao.DepartmentDao;
import com.hrms.dao.DepartmentDaoImpl;

public class RegisterDepartmentUsecase {
	public static void register() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println();
		System.out.println("<-------- Department Registration Page --------> ");
		System.out.println();
		System.out.println();
		
		System.out.println("Enter Department Name :");
		String dname=sc.next();
		
		System.out.println("Enter Department DNO : ");
		int dNO=sc.nextInt();
		
		DepartmentDao dao = new DepartmentDaoImpl();
		
		Department department = new Department();
		
		department.setDname(dname);
		department.setDNO(dNO);
		
		String result = dao.registerDepartment(department);
		
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
