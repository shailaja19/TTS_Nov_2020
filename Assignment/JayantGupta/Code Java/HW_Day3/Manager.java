package HW_Day3;

public class Manager extends Employee{
	Manager(int a,String b,double c)
	{
		super(a,b,c);
	}	
	public double salCal() {
		empSal=empSal+20000;
		return empSal;
//		System.out.println(empSal+" is the salary of the Manager.");

	}

}
