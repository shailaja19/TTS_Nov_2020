package com.sonata.Dao;
import java.util.List;
import com.sonata.Model.Product;
import java.sql.SQLException;

public interface ProdDao {
	
		   public int insert(Object object);
		   public List<Product> getData();
		   public int delete(Object object);
		   public int update(Object object);

	}


