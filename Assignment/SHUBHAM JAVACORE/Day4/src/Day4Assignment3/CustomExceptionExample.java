package Day4Assignment3;

public class CustomExceptionExample {
	
	public static void main(String[] args) throws MyCustomException{
		double salary = 500000;
		//	Custom Exceptions
		if(salary<100000)
			throw new MyCustomException("Salary is less than 100000");
		else
			System.out.println("Employee Salary is greater or equal to 100000");
	}

}