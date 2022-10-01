package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class AcceptLeavesUsecase {
	public static void main(String[] args) {
		
	}
		
		public static void acceptLeaves() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Employee Id  : ");
			int empid=sc.nextInt();
			
			EmployeeDao dao = new EmployeeDaoImpl();
			
			String result = dao.acceptLeaves(empid);
			
			System.out.println(result);
		}

}
