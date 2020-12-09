public class Manager extends Employee {
	public double salCal() {
		 super.salCal();
		double extra=30000;
		empSal=extra+super.salCal();
		return empSal;
	}