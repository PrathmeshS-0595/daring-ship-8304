package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class RejectLeavesUsecase {
	public static void rejectLeaves() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id  : ");
		int empid=sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		String result = dao.rejectLeaves(empid);
		
		System.out.println(result);
	}

}
