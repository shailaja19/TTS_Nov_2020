package Assignment3.EmployeeException;

public class Staff extends Employee {
	String title;
	public void calculateSalary() {
		
		
		double HRA=BasicPay*0.18;
		double salary;
		salary=HRA+BasicPay;
		System.out.println("Staff Salary: "+salary);
	
		
	}

}

