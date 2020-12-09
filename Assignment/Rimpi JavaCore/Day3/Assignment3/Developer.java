package Assignment3;

public class Developer extends Employee {
	
		double BasicPay=2500;
		double HRA= 7600.12;
		


		public void SalCal() {
		this.empSal=BasicPay+HRA;
		System.out.println("Developer Salary: " +empSal);
		System.out.println();
		}
}
