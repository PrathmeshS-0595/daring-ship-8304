package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.bean.Employee;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;

public class TransferDepartmentUsecase {
public static void transferdepart() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println();
		System.out.println("<-------- Department Transfer Page --------> ");
		System.out.println();
		System.out.println();
		
		System.out.println("Enter Department Id : ");
		int edid= sc.nextInt();
		
		System.out.println("Enter Employee ID : ");
		int eid=sc.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		Employee employee = new Employee();
		
		employee.setEdid(edid);
		employee.setEid(eid);
		
		String rs = dao.changeDepartment(eid, edid);
		
		System.out.println(rs);
	}

}
