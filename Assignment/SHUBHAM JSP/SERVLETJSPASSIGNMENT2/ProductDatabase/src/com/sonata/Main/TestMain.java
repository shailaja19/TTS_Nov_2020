package com.sonata.Main;

import java.sql.SQLException;
import java.util.List;

import com.sonata.DaoImpl.*;
import com.sonata.Model.*;

public class TestMain {
	public static void main(String args[]) throws SQLException{

		Product p1= new Product();
		p1.setName("Toy");
		p1.setPrice("123");
		
		ProductDAOImpl dao=new ProductDAOImpl();
		int s1=dao.save(p1);
		System.out.println("One row is inserted"+s1);
}
}