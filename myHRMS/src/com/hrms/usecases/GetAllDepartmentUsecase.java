package com.hrms.usecases;

import java.util.List;
import java.util.Scanner;

import com.hrms.Application.AdminLink;
import com.hrms.Application.Main;
import com.hrms.Exception.DepartmentException;
import com.hrms.bean.Department;
import com.hrms.dao.DepartmentDao;
import com.hrms.dao.DepartmentDaoImpl;

public class GetAllDepartmentUsecase {

	public static void viewAllDepartment() {
		Scanner sc= new Scanner(System.in);
		DepartmentDao dao = new DepartmentDaoImpl();
		
		try {
			
		List<Department> dep=dao.allDepartment();
		
		dep.forEach(e->{
			System.out.println("Employee Id is : "+ e.getDname());
			System.out.println("Employe name is : "+e.getDNO());
			
			System.out.println("=====================================");
		});
		
		
		} catch (DepartmentException e) {
		
			System.out.println(e.getMessage());
		
		
		}
		
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
