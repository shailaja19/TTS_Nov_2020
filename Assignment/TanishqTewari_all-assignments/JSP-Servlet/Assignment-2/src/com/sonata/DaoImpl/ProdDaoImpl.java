package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Dao.ProdDao;
import com.sonata.Model.product;

public class ProdDaoImpl implements ProdDao{
	int row=0;
	DbConnection db = new DbConnection();
	product product=null;

	public int add(Object object) {
	try {
		product= (product)object;
		PreparedStatement cs = db.getConnection().prepareStatement
				("insert into Product values(?,?,?)");
		
		cs.setInt(1,product.getProdId());
		cs.setString(2,product.getProdName());
		cs.setDouble(3,product.getPrice());
		row=cs.executeUpdate();
		db.closeConnection();
	}catch(SQLException e) {System.out.println(e);}
	return row;
}

	public List<product> getAllProduct() {
		List<product> prodList=new ArrayList<>();
    	try {
    		PreparedStatement cs1=db.getConnection().prepareStatement("select * from Student");
    		ResultSet rs=cs1.executeQuery();
    		while(rs.next()) {
    			product s=new product();
    			int prodId=rs.getInt(1);
    			String prodName=rs.getString(2);
    			double price=rs.getDouble(3);
    			s.setProdId(prodId);
    			s.setProdName(prodName);
    			s.setPrice(price);
    			prodList.add(s);
    		}
    	}catch(SQLException se) {
    		se.printStackTrace();
    	}
    	return prodList;
	}
}
