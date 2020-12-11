package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.sonata.Dao.Dao;
import com.sonata.Model.Product;




public class DAOImpl  implements Dao{
	int row=0;
	DbConnection db=new DbConnection();
	Product product=null;
	
	public int save(Object object) {
		try {
			product =(Product)object;
			PreparedStatement cs=db.getConnection().prepareStatement
					("insert into product values(?,?,?)");
			cs.setInt(1, product.getpId());
			cs.setString(2,product.getpName());
			cs.setDouble(3, product.getpPrice());
			row =cs.executeUpdate();
			db.closeConnection();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return row;
	}

	@Override
	public List<Product> getData() {
		List<Product> prodList=new ArrayList<>();
		try {
			PreparedStatement cs1 =db.getConnection().prepareStatement("select * from product");
			ResultSet rs=cs1.executeQuery();
			while(rs.next()) {
				Product prod=new Product();
				int pId=rs.getInt(1);
				String pName=rs.getString(2);
				double pPrice=rs.getDouble(3);
				prod.setpId(pId);
				prod.setpName(pName);
				prod.setpPrice(pPrice);
				prodList.add(prod);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return prodList;
	}

	@Override
	public int delete(Object object) {
		// TODO Deleting a entry
		try {
			product= (Product)object;
			PreparedStatement cs = db.getConnection().prepareStatement
					("delete from product where pId=?");
			
			cs.setInt(1,product.getpId());
			row=cs.executeUpdate();
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row;
	}

	@Override
	public int update(Object object) {
		// TODO Updating a entry
		try {
			product= (Product)object;
			PreparedStatement cs = db.getConnection().prepareStatement
					("update product set pName=? where pId=?");
			cs.setString(1,product.getpName());	
			cs.setInt(2,product.getpId());
			row=cs.executeUpdate();
//			ps.setDouble(1, 5000);
//			ps.setInt(2, 777);
//			
//			int a=ps.executeUpdate();
//			System.out.println("The number of records updated are "+ a);

			
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row;
		}
}
	

