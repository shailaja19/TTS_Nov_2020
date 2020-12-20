package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Dao.LoginInterface;
import com.sonata.Model.Employee;


public class LoginImplementation implements LoginInterface {
	int r = 0;
	DbConnection db = new DbConnection();
	@Override
	public boolean validate(int empId, String pass) {
		boolean status = false;
	    ResultSet rs = null;
		try {	
				PreparedStatement cs = db.getConnection().prepareStatement
						("Select * from Employee where EmployeeId=? and EmployeePassword=?");
		       	cs.setInt(1,empId);
		    	cs.setString(2,pass);
		        rs = cs.executeQuery();
	            status = rs.next();
		    	db.closeConnection();
		    }catch(SQLException e) {System.out.println(e);}
		return status;
	}

	@Override
	public List<Employee> getData(int empId) {
		List<Employee> List=new ArrayList<>();
		try {
			PreparedStatement cs1 =db.getConnection().prepareStatement("select employeename from employee where EmployeeId=?");
			ResultSet rs=cs1.executeQuery();
			//A table of data representing a database result set, which is usually generated b
			//By executing a statement that queries the database.
			while(rs.next()) {
				Employee emp=new Employee();
				int employeeID=rs.getInt(1);
				String employeeName=rs.getString(2);
				emp.setEmployeeName(employeeName);
				
				List.add(emp);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return List;

}
}

