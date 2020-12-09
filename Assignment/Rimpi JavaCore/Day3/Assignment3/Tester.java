package Assignment3;

public class Tester extends Employee {
		double BasicPay=5000;
		double HRA= 7000.12;
		


		public void SalCal() 
		{
			this.empSal=BasicPay+HRA;
			System.out.println("Tester Salary: " +empSal);
			System.out.println();
			
		}
}
