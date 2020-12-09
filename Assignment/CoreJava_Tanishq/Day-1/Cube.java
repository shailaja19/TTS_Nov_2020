package exercise_day01;
import java.util.Scanner;

// Cube of a number

public class Cube {

	public static void main(String[] args)

	{
	    int n;

	    System.out.println("Enter a number:");
	    Scanner sc = new Scanner(System.in);
			    n = sc.nextInt();

	    System.out.println("The cube of " +n+" is: "+(n*n*n));     
	    
	 }
}
