package exercise_day01;

// finds the greatest number amongst the three

public class Greatest_number {

	public static void main(String args[]) {

	      int num1 = 12, num2 = 25, num3 = 89;

	      if( num1 >= num2 && num1 >= num3)
	          System.out.println(num1+" is the largest Number");

	      else if (num2 >= num1 && num2 >= num3)
	          System.out.println(num2+" is the largest Number");

	      else
	          System.out.println(num3+" is the largest Number");
	  }
}

