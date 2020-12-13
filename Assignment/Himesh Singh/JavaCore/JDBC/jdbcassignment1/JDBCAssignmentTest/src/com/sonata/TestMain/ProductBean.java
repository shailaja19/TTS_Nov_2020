package com.sonata.TestMain;

import java.sql.SQLException;
import java.util.List;

import com.sonata.DaoImpl.ProdDAOImpl;
import com.sonata.Model.Product;


public class ProductBean {
	      public static void main(String[] args) throws SQLException {
			Product p1=new Product();
		     p1.setProductID(126);
			 p1.setProductName("ps");
			 p1.setProductPrice(25000);
			 
			Product p2=new Product();
			 p2.setProductID(126);
			 
			 Product p3=new Product();
			 p3.setProductID(124);
			 p3.setProductName("TV");
			 
		
		
			
			ProdDAOImpl dao=new ProdDAOImpl();
			int row=dao.insert(p1);
			System.out.println(row);
			int del=dao.delete(p2);
			System.out.println(del);
			int upd=dao.update(p3);
			System.out.println(upd);
			
			
			
			List<Product> list=dao.getData();
			for(Product p:list) {
				System.out.println(p.getProductID());
				System.out.println(p.getProductName());
				System.out.println(p.getProductPrice());
			}
		}
	}


