package com.sonata.DAO;

import java.util.List;

import com.sonata.Model.Product;
public interface ProdDao {
      
	public int insert(Object object);
	   public List<Product> getData();
}
