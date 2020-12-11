package com.sonata.Dao;

import java.util.List;

import com.sonata.Model.product;



public interface ProdDao {
	public int add(Object object); 
	public List<product> getAllProduct();

}
