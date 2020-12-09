package HW_Day3;

public class Developer extends Employee{
	Developer(int a,String b,double c)
	{
		super(a,b,c);
	}	
	public double salCal() {
		empSal=empSal+10000;
		return empSal;
//		System.out.println(empSal+" is the salary of the Developer.");
	}

}
