package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class ApplyForLeaveUsecase {
		
		public static void applyLeaves() {
		   
			Scanner sc =new Scanner(System.in);
			System.out.println("Leave Record System");
			System.out.println();
			System.out.println();
			
			System.out.println("Enter Employee ID :");
			int empid=sc.nextInt();
			
			System.out.println("Type Applied to apply for leave");
			String app=sc.next();
			
		    EmployeeDao dao=new EmployeeDaoImpl();
			
		    String result= dao.applyLeave(empid, app);
			
		    System.out.println(result);
		

 }
}
