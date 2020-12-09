public class Developer extends Employee {
	public double salCal() {
		 super.salCal();
		double extra=20000;
		empSal=extra+super.salCal();
		return empSal;
	}

}