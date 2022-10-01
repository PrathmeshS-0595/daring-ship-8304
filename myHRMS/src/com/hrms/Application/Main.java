package com.hrms.Application;

import java.util.Scanner;

import com.hrms.usecases.LoginEmployee;

public class Main {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println();
		System.out.println();
		System.out.println(" Welcome To Human Resource Management System ");
		System.out.println("<-------------------------------------------->");
		System.out.println();
		System.out.println();
		
		System.out.println("Press 1 to Login As Admin");
		System.out.println();
		System.out.println("Press 2 to Login As Employee");
		System.out.println();
		System.out.println("Press 3 to Exit");
		
		System.out.println();
		System.out.println();
		
		int choice =sc.nextInt();
		
		switch (choice) {
		
		case 1: {
			
			System.out.println("Enter Admin Username (Admin): ");
			String username=sc.next();
			
			System.out.println("Enter Admin Password (123) : ");
			String pass = sc.next();
			
			if(username.equals("Admin") && pass.equals("123")) 
				AdminLink.linkingAdmin();
				else 
				{
				System.out.println("Invalid Credential");
				}
			break;
			
		}
		case 2:{
			LoginEmployee.loginEmployee();
			break;
			
		}
		case 3:{
			System.out.println("Application Closed");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected Exit: " + choice);
		}
		
		
		
	
	}

}
