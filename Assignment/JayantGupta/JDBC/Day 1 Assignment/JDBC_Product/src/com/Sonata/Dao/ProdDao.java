package com.Sonata.Dao;
import java.util.List;
import com.Sonata.Model.Product;

public interface ProdDao {
	public int save(Object object);
	public List<Product> getData();
	public int delete(Object object);
	public int update(Object object);


}
