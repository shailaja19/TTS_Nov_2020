package exercise_day01;

import java.util.Arrays;

// prints two large numbers in an array

public class Large_numbers {

	public static void main(String args[])
	{
		int a[]= {2,22,7,18,12,13};
		Arrays.sort(a);
		
		System.out.println("Largest number: " +a[a.length -1]);
		System.out.println("Second largest number: " +a[a.length -2]);
	}
}
