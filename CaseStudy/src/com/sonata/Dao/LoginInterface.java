package com.sonata.Dao;

import java.util.List;

import com.sonata.Model.Employee;


public interface LoginInterface {
	public boolean validate(int empId, String pass);

	List<Employee> getData(int empId);
}
