package com.sonata.DaoImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Dao.ProductDao;
import com.sonata.Model.Product;



public class ProductDAOImpl implements ProductDao {
	int row=0;
	DbConnection db=new DbConnection();
	Product product=null;
	@Override
	public int save(Object object) {
		try {
			product =(Product)object;
			PreparedStatement cs=db.getConnection().prepareStatement
					("insert into product values(?,?)");
			cs.setString(1,product.getName());
			cs.setString(2,product.getPrice());
			row =cs.executeUpdate();
			db.closeConnection();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return row;
	}
	
	@Override
	public List<Product> getData() {
		List<Product> List=new ArrayList<>();
		try {
			PreparedStatement cs1 =db.getConnection().prepareStatement("select * from product");
			ResultSet rs=cs1.executeQuery();
			//A table of data representing a database result set, which is usually generated b
			//By executing a statement that queries the database.
			while(rs.next()) {
				Product product=new Product();
				String name=rs.getString(1);
				String price=rs.getString(2);
				product.setName(name);
				product.setPrice(price);
				List.add(product);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return List;

}
}
