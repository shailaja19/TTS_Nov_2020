package com.sonata.Main;
import java.sql.SQLException;

import com.sonata.DaoImpl.EmpDAOImpl;
import com.sonata.Model.*;

public class TestBean {
	public static void main(String args[]) throws SQLException{
		Employee e1= new Employee();
		e1.setEmpId(459);
		e1.setEmpName("TESTTRIAL");
		e1.setEmpSal(3333.33);
		
		EmpDAOImpl dao=new EmpDAOImpl();
		int row=dao.save(e1);
		System.out.println("no of row added: " +row);
		/* List<Employee> list = dao.getData();
		 * for(Employee e : list){
		 * System.out.println(e.getEmpId());
		 * System.out.println(e.getEmpName());
		 * Sysetm.out.println(e.getEmlSal());
		 */
		
	}
	

}
