package com.sonata.Dao;

import java.util.List;

import com.sonata.Model.Product;

public interface ProductDao {
	public int save(Object object);

	List<Product> getData();
}



















