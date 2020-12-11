package com.sonata.Main;

import java.sql.SQLException;
import java.util.List;
import com.sonata.DaoImpl.DAOImpl;
import com.sonata.Model.Product;

public class TestMain{
	public static void main(String args[]) throws SQLException{
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		Product p5=new Product();
		p1.setpId(420);
		p1.setpName("SAMSUNG");
		p1.setpPrice(10000);
		
		p3.setpId(421);
		p3.setpName("NOKIA PHONE");
		p3.setpPrice(5000);
		
		p3.setpId(422);
		p3.setpName("PROTONICS");
		p3.setpPrice(2000);
		
		p4.setpId(423);
		p4.setpName("LG MACHINE");
		p4.setpPrice(2000);
		
		p5.setpName("LG");
		p5.setpId(423);
		
		DAOImpl dao=new DAOImpl();
		int row1=dao.save(p1);
		int row2=dao.save(p2);
		int row3=dao.save(p3);
		int row4=dao.save(p4);
		System.out.println("no of row added");
		System.out.println("row1: " +row1);
		System.out.println("row2: " +row2);
		System.out.println("row3: " +row3);
		System.out.println("row4: " +row4);
		System.out.println();
		int row5=dao.delete(p2);
		System.out.println("no of row deleled: " + row5);
		System.out.println();
		
		int row6=dao.update(p5);
		System.out.println("no of row updated: " + row6);
		System.out.println();
		
		List<Product> list = dao.getData();
		for(Product e:list) {
			System.out.println(e.getpId());
			System.out.println(e.getpName());	
			System.out.println(e.getpPrice());	
		 	}
	}
	
}
