package HW_Day3_Part2;

public class CallEmployeeException {
	public static void main(String[] args) throws EmployeeException{
		double salary=10000;
		if(salary<100000)
		{
			throw new EmployeeException("Salary less than 1,00,000.");
		}
		else
			System.out.println("Salary is "+salary);
		
	}

}
