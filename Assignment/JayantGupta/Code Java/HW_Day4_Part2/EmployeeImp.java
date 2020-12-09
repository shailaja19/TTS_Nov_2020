package com.Sonata.CompletEmp;


import java.util.LinkedList;
import java.util.List;

public class EmployeeImp implements EmployeeInt{
	List<Employee> l1 = new LinkedList<>();
	
	@Override
	public void addEmployee(Employee o) {
		l1.add(o);
	}
	@Override
	public void removeEmployee(Employee o) {
		l1.remove(o);
	}
	@Override
	public double yearSalary(Employee e1) {
		return e1.empSal * 12.00;
	}
	@Override
	public double appSalary(Employee e) {
		if(e.empSal<10000.00) {
			return ((e.empSal + 5000.00) * 12.00);
		}
		else
			return (e.empSal * 12.00);
	}
	
}
