package exercise_day01;

// To find whether the specific value is in the array

public class Specific_value {

	public static void main(String args[])
	{
	      int a[] = {7,14,21,28,35};
	      int n = 21;

	      for(int i = 0; i<a.length; i++)
	      {
	         if(n == a[i])
	         {
	            System.out.println("Array contains the given element");
	         }
	        	 
	      }
	}
}
