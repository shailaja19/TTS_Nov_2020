package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.sonata.Dao.EmpDao;
import com.sonata.Model.Employee;

public class EmpDaoImpl implements EmpDao {
	int row=0;
	DbConnection db = new DbConnection();
	Employee employee=null;
	
	public int save(Object object) {
	try {
		employee= (Employee)object;
		PreparedStatement cs = db.getConnection().prepareStatement
				("insert into Employee values(?,?,?)");
		
		cs.setInt(1,employee.getEmpId());
		cs.setString(2,employee.getEmpName());
		cs.setDouble(3,employee.getEmpSal());
		row=cs.executeUpdate();
		db.closeConnection();
	}catch(SQLException e) {System.out.println(e);}
	return row;
}
	/*
	@Override
	public List<Employee> getData(){
		List<Employee> empList=new ArrayList<>();
		try {

			PreparedStatement cs1 = db.getConnection().prepareStatement
					("select * from Employee");
			ResultSet rs= cs1.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				int empId=rs.getInt(1);
				String empName=rs.getString(2);
				double empSal=rs.getDouble(3);
				emp.setEmpId(empId);
				emp.setEmpName(empName);
				emp.setEmpSal(empSal);
				empList.add(emp);
			}
		}catch(SQLException se) {se.printStackTrace();}
		return empList;
		*/
}
