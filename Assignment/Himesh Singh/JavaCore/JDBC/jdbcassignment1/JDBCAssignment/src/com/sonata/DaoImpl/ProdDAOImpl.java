package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Dao.ProdDao;
import com.sonata.Model.Product;

public class ProdDAOImpl implements ProdDao{

	 int row=0;
	 int del=0;
	 int upd=0;
	    DbConnection db=new DbConnection();
	    Product product=null;
	    
	    public int insert(Object object) {
	    	try {
	    		product=(Product)object;
	    		PreparedStatement cs=db.getConnection().prepareStatement("insert into Product(productID,productName,productPrice) values(?,?,?)" );
	             cs.setInt(1,product.getProductID());
	             cs.setString(2, product.getProductName());
	             cs.setDouble(3, product.getProductPrice());
	             row=cs.executeUpdate();
	             db.closeConnection();
	             
	    	}catch(SQLException e2) {System.out.println(e2);
	    		
	    	}
	    	return row;
}
	    public int delete(Object object) {
	    	try {
	    		product=(Product)object;
	    		PreparedStatement cs=db.getConnection().prepareStatement("delete from Product where productId=?" );
	             cs.setInt(1, product.getProductID());
	             del=cs.executeUpdate();
	             db.closeConnection();
	             
	    	}catch(SQLException e2) {System.out.println(e2);
	    		
	    	}
	    	return del;
	    }
	    public int update(Object object) {
	    	try {
	    		product=(Product)object;
	    		PreparedStatement cs=db.getConnection().prepareStatement("update Product set productName= ? where productID= ?" );
	             cs.setInt(1, product.getProductID());
	             cs.setString(2, product.getProductName());
	            
	             upd=cs.executeUpdate();
	             db.closeConnection();
	    		
	    	}
	    	catch(SQLException e2) {System.out.println(e2);
    		
	    	}
	    	return upd;
	    }
	    @Override
	    public List<Product> getData(){
	    	List<Product> proList=new ArrayList<>();
	    	try {
	    		PreparedStatement cs1=db.getConnection().prepareStatement("select * from Product");
	    		ResultSet rs=cs1.executeQuery();
	    		while(rs.next()) {
	    			Product pr=new Product();
	    			int productID=rs.getInt(1);
	    			String productName=rs.getString(2);
	    			double productPrice=rs.getDouble(3);
	    			pr.setProductID(productID);
	    			pr.setProductName(productName);
	    			pr.setProductPrice(productPrice);
	    			proList.add(pr);
	    		}
	    	}catch(SQLException se) {
	    		se.printStackTrace();
	    	}
	    	return proList;
	    }
}
