package com.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Dao.EmpDao;
import com.Model.Employee;

public class EmpDAOImpl implements EmpDao{
    int row=0;
    DbConnection db=new DbConnection();
    Employee employee=null;
    
    public int save(Object object) {
    	try {
    		employee=(Employee)object;
    		PreparedStatement cs=db.getConnection().prepareStatement("insert into Employee(empId,empName,empSal) values(?,?,?)" );
             cs.setInt(1,employee.getEmpId());
             cs.setString(2, employee.getEmpName());
             cs.setDouble(3, employee.getEmpSal());
             row=cs.executeUpdate();
             db.closeConnection();
             
    	}catch(SQLException e2) {System.out.println(e2);
    		
    	}
    	return row;
    }
}
