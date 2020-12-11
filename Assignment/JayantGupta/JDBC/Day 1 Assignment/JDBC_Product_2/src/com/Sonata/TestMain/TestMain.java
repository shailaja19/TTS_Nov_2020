package com.Sonata.TestMain;

import java.sql.SQLException;
import java.util.List;
import com.Sonata.DaoImpl.ProdDAOImpl;
import com.Sonata.Model.Product;


public class TestMain {
	public static void main(String[] args) throws SQLException{ 
	Product p1 = new Product();
	Product p2 = new Product();
	Product p3 = new Product();
	
	p1.setProdId(65);
	p1.setProdName("Pencil");
	p1.setProdPrice(10);
	
	p2.setProdId(34);
	p2.setProdName("Eraser");
	p2.setProdPrice(5);
	
	p3.setProdId(34);
	p3.setProdName("Sharpner");
	p3.setProdPrice(5);
	
	p3.setProdId(34);
	p3.setProdName("Sharpner");
	p3.setProdPrice(5);
	
	
	ProdDAOImpl dao= new ProdDAOImpl();
	int row1=dao.save(p1);
	int row2=dao.save(p2);
	System.out.println(row1);
	System.out.println(row2);
	
	int row3=dao.delete(p2);
	System.out.println(row3);
	
	int row4=dao.update(p3);
	System.out.println(row4);
	
	List<Product> list = dao.getData();
	for(Product e:list) {
		System.out.println(e.getProdId());
		System.out.println(e.getProdName());
		System.out.println(e.getProdPrice());
	}
	}
}