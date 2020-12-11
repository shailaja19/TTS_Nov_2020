package com.sonata.Dao;
import java.util.List;

import com.sonata.Model.*;
public interface EmpDao {
	public int save(Object object);
	public List<Employee> getData();
	//public int delete(Object object);
	//public int update(Object object);
	

}
