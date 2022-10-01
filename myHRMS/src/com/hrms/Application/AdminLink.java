package com.hrms.Application;

import java.util.Scanner;

import com.hrms.usecases.RegisterDepartmentUsecase;
import com.hrms.usecases.RegisterEmployeeUsecase;
import com.hrms.usecases.RejectLeavesUsecase;
import com.hrms.usecases.AcceptLeavesUsecase;
import com.hrms.usecases.GetAllDepartmentUsecase;
import com.hrms.usecases.TransferDepartmentUsecase;
import com.hrms.usecases.UpdateDepartmentUsecase;

public class AdminLink {
public  static void linkingAdmin() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		System.out.println();
		System.out.println("<--------------- Welcome to Admin Section --------------->");
		System.out.println();
		System.out.println();
		
		System.out.println("Press 1. Add new Departments.");
		System.out.println("Press 2. View Departments ");
		System.out.println("Press 3. Update Department ");
		System.out.println("Press 4. Register Employees ");
		System.out.println("Press 5. Transfer Employee to other Departments.");
		System.out.println("Press 6. Accept leaves Request");
		System.out.println("Press 7. Reject Leaves Request");
		System.out.println("Press 8. Exit App.");
		
		int choice = sc.nextInt();
		
		
		switch (choice) {
		case 1: {
			RegisterDepartmentUsecase.register();
			break;
		}
		case 2: {
			GetAllDepartmentUsecase.viewAllDepartment();
			break;
		}
		case 3: {
			UpdateDepartmentUsecase.updatedept();
			break;
		}
		case 4: {
			RegisterEmployeeUsecase.registerEmployee();
			break;
		}
		case 5: {
			TransferDepartmentUsecase.transferdepart();
			break;
		}
		case 6: {
			AcceptLeavesUsecase.acceptLeaves();
			break;
		}
		case 7: {
			RejectLeavesUsecase.rejectLeaves();
			break;
		}
		case 8: {
			System.out.println("Application Closed");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected entry: " + choice);
		}
		
		
		
	}

}
