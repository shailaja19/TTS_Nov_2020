package Day_03_Q4;

public class Staff extends Employee {

	String title;

	@Override
	public void calculateSalary() {
		double HRA= basic*0.18;
		double salary;
		salary=HRA+ basic;
		System.out.println("The salary of Staff is:" +salary);
		
	}

	
}
