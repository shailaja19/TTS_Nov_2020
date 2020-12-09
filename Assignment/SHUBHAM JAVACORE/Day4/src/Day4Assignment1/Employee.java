package Day4Assignment1;

//) Create Employee class with below attributes and override the toString() method to display the employee data:-
//a.     Employee ID
//b.     Employee Name
//c.     Employee Salary
//
//Create an interface EmployeeInt with following methods:
//
//Ø     public void addEmployee(Employee e);
//
//Ø     public void deleteEmployee(Employee e);
//
//Ø     public  Object readEmployee();
//
//o     public double yearSalary(Employee e1);
//
//o     public double appSalary(Employee e1)
//              Implement the interface in EmployeeImpl class.


 


public class Employee {
	int EmpId;
	String EmpName;
	double EmpSalary;
	
	Employee(int a,String b,double c){
		this.EmpId=a;
		this.EmpName=b;
		this.EmpSalary=c;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
	}
	

}
