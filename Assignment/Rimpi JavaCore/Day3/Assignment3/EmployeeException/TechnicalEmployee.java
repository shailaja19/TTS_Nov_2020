package Assignment3.EmployeeException;

public class TechnicalEmployee extends Employee {
	String skill;
	public void calculateSalary() 
	{
		double HRA=BasicPay*0.12;
		double salary;
		salary=HRA+BasicPay;
		System.out.println("Technical Employee salary: "+salary);
	
		
	}

}
