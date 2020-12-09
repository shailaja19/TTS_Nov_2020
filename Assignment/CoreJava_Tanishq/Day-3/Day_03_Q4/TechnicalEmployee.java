package Day_03_Q4;

public class TechnicalEmployee extends Employee {

	String tech_skill; 
	
	@Override
	public void calculateSalary() {
		
		double HRA= basic*0.12;
		double salary;
		salary=HRA+ basic;
		System.out.println("The salary of technical employee is:" +salary);
		
	}

	
}
