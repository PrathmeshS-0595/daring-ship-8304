package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.bean.Department;
import com.hrms.dao.DepartmentDao;
import com.hrms.dao.DepartmentDaoImpl;

public class UpdateDepartmentUsecase {

	public static void updatedept() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Department Name : ");
		String dname=sc.next();
		
		System.out.println("Enter Department Id : ");
		int did=sc.nextInt();
		
		DepartmentDao dao=new DepartmentDaoImpl();
		
		Department department = new Department();
		
		department.setDname(dname);
		department.setDNO(did);
		
		String result = dao.updateDepartment(department);
		
		System.out.println(result);
	}

}
