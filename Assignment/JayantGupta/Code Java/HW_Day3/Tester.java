package HW_Day3;

public class Tester extends Employee{
	Tester(int a,String b,double c)
	{
		super(a,b,c);
	}	
	public double salCal() {
		empSal=empSal+5000;
		return empSal;
//		System.out.println(empSal+" is the salary of the Tester.");
	}

}
