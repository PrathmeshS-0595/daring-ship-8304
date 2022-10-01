package com.hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hrms.Exception.DepartmentException;
import com.hrms.bean.Department;
import com.hrms.utility.DBUtil;

public class DepartmentDaoImpl implements DepartmentDao {
	@Override
	public String registerDepartment(Department Department) {
		
		String message ="Not Inserted..";
		
		
		
		try(Connection conn= DBUtil.provideConnection();) {
			
			PreparedStatement ps = conn.prepareStatement("insert into Department value(?,?)");
			
			
			ps.setString(1, Department.getDname());
			ps.setInt(2, Department.getDNO() );
			
			
			int X= ps.executeUpdate();
			
			if(X>0)
				message="Department added Sucessfully !";
			
			
			} catch (SQLException e) {
				message=e.getMessage();
			}
			
			return message;
	}

	@Override
	public List<Department> allDepartment() throws DepartmentException {
		
		
		List<Department> departments= new ArrayList<>();
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from department");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				String Dname= rs.getString("Dname");
				int Dno = rs.getInt("Dno");
				int Did=rs.getInt("Did");
				
				Department department= new Department(Dname, Dno,Did) ;

				departments.add(department);
				
			}
			
		}catch (SQLException e) {
		throw new DepartmentException();
		
		}
		if(departments.size()==0) 
			throw new DepartmentException("No Department Found ! .. ");
		
		
		
		
		return departments;
	}

	@Override
	public String updateDepartment(Department department) {
		
		String message="Department Not fount !...";
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("update department set Dname=? where DNO=?");
			ps.setString(1, department.getDname());
			ps.setInt(2, department.getDNO());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Department update";
			}
			
			
		} catch (SQLException e) {
			
			message=e.getMessage();
		}
		
		return message;
	}

}
