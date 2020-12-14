package PracticalEmployee;
 
// Technical employee is extending employee class i.e. this will inherit the property of employee class
public class TechnicalEmployee extends Employee {
	public String skill;
	public void calculateSalary() 
	{
		double HRA=BasicPay*0.12;
		double salary;
		salary=HRA+BasicPay;
		System.out.println("Technical Employee salary is: "+salary);
	
		
	}

}