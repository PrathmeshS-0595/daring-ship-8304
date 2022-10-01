package com.hrms.Application;

import java.util.Scanner;

import com.hrms.usecases.ApplyForLeaveUsecase;
import com.hrms.usecases.EmployeeUpdateProfileUsecase;
import com.hrms.usecases.GetEmployeeById;
import com.hrms.usecases.UpdatepasswordEmpUsecase;

public class EmployeeLink {
public  static void linkingEmployeeMethod() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<---- Welcome Employee  Section ---->");
		
		System.out.println();
		System.out.println("Press 1 . View Profile ");
		System.out.println();
		System.out.println("Press 2 . Update Profile ");
		System.out.println();
		System.out.println("Press 3 . Change Password");
		System.out.println("");
		System.out.println("Press 4 . Apply For Leave");
		System.out.println();
		System.out.println("Press 5 . Exit");
		System.out.println();
		
		int choice=sc.nextInt();
		
		
		switch (choice) {
		case 1: {
			GetEmployeeById.viewEmployById();
			break;
		}
		case 2: {
				EmployeeUpdateProfileUsecase.updateProfile();
				break;
				}
		case 3: {
			UpdatepasswordEmpUsecase.changePassword();
			break;
			
		}
		case 4: {
			ApplyForLeaveUsecase.applyLeaves();
			break;
			
		}
		case 5: {
			System.out.println("Application Closed");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected Entry: " + choice);
		}
		
		
		
		
		
		
	}

}
