package exercise_day01;

// Sum values of an array

public class Sum {
  
	public static void main (String args[])
	{
		int a[]= {1,2,3,4,5,6};
		int s=0;
		
		for(int i=0; i<a.length; i++)
		{
			s=s+a[i];
		}
		
		System.out.println("The sum is: " +s );
	}
}
