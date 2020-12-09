package Day4Assignment1;

import java.util.LinkedList;
import java.util.List;

import Day4Assignment2.Student;

//Write a UserEmployee class which creates few instance of Employee class in main method and add the Employees in an List and display them using above methods.
//
//a)     Check for the duplication of employee ID with comparable method. If found handle DuplicateEmpoyeeID Exception
//
//b)     Increase the employee salary by 5000 if the Employee Salary is less than 10,000
//
//c)     Calculate the yearly salary for given employee.


public class UserEmployee {
	public static void main(String[] args) throws DuplicateEmployeeID {
		List<Employee> m1=new LinkedList<Employee>();
		//Creating object of employee to use in the other module
		Employee e1=new Employee(111,"Shubh",9999.00);
		
		m1.add(new Employee(124,"Sam", 77000.00));
		m1.add(new Employee(126,"Raju", 67000.00));
		m1.add(new Employee(321,"Keni", 88000.00));
		m1.add(new Employee(422,"Jerry", 98000.00));
		m1.add(e1);
		
		for(Employee m2:m1) 
	    {
	    	System.out.println(m2.EmpId+" "+m2.EmpName+" "+m2.EmpSalary);
		}
		System.out.println();
		System.out.println("After deleting Employee value and adding another value: ");
		
		//Deleting the value from array using index value
		m1.remove(0);
		for(Employee m2:m1) 
	    {
	    	System.out.println(m2.EmpId+" "+m2.EmpName+" "+m2.EmpSalary);
		}
		System.out.println();
		//Adding the values at a specific index
		m1.add(0,new Employee(224,"Shanvi", 45000.00));
		System.out.println("After adding a new Employee value: ");
		for(Employee m2:m1) 
	    {
	    	System.out.println(m2.EmpId+" "+m2.EmpName+" "+m2.EmpSalary);
		}
	}
}

