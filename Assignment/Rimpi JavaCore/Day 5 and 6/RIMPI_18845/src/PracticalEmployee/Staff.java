package PracticalEmployee;

//staff class is inherit the property of employee class
public class Staff extends Employee {
	public String title;
	public void calculateSalary() {
		
		double HRA=BasicPay*0.18;
		double salary;
		salary=HRA+BasicPay;
		System.out.println("Staff Salary is: "+salary);
	
		
	}

}