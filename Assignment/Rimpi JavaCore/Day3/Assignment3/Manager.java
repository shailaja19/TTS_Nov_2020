package Assignment3;

public class Manager extends Employee {
	double BasicPay=1500;
	double HRA= 7500.12;


public void SalCal() {
		this.empSal=BasicPay+HRA;
		System.out.println("Manager Salary: " +empSal);
		System.out.println();
		
	}
}


