public class Tester extends Employee {
	
	public double salCal() {
		 super.salCal();
		double extra=10000;
		empSal=extra+super.salCal();
		return empSal;
	}

}