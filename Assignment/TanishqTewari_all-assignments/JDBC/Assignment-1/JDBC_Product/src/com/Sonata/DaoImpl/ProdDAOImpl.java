package com.Sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Sonata.Dao.ProdDao;
import com.Sonata.Model.Product;


public class ProdDAOImpl implements ProdDao{
	int row=0;
	DbConnection db = new DbConnection();
	Product product=null;
	@Override
	public int save(Object object) {
	try {
		product= (Product)object;
		PreparedStatement cs = db.getConnection().prepareStatement
				("insert into product values(?,?,?)");
		
		cs.setInt(1,product.getProdId());
		cs.setString(2,product.getProdName());
		cs.setDouble(3,product.getProdPrice());
		row=cs.executeUpdate();
		db.closeConnection();
	}catch(SQLException e) {System.out.println(e);}
	return row;
}
	@Override
	public List<Product> getData(){
		List<Product>prodList=new ArrayList<>();
		try {

			PreparedStatement cs1 = db.getConnection().prepareStatement
					("select * from product");
			ResultSet rs= cs1.executeQuery();
			while(rs.next()) {
				Product pro = new Product();
				int prodId=rs.getInt(1);
				String prodName=rs.getString(2);
				double prodPrice=rs.getDouble(3);
				pro.setProdId(prodId);
				pro.setProdName(prodName);
				pro.setProdPrice(prodPrice);
				prodList.add(pro);
			}
		}catch(SQLException se) {se.printStackTrace();}
		return prodList;
		}
	@Override
	public int delete(Object object) {
	try {
		product= (Product)object;
		PreparedStatement cs = db.getConnection().prepareStatement
				("delete from product where prodId=?");
		
		cs.setInt(1,product.getProdId());
		row=cs.executeUpdate();
		db.closeConnection();
	}catch(SQLException e) {System.out.println(e);}
	return row;
}
	@Override
	public int update(Object object) {
	try {
		product= (Product)object;
		PreparedStatement cs = db.getConnection().prepareStatement
				("update product set prodName=? where prodId=?");
		cs.setString(1,product.getProdName());	
		cs.setInt(2,product.getProdId());
		row=cs.executeUpdate();
		db.closeConnection();
	}catch(SQLException e) {System.out.println(e);}
	return row;
	}
}
