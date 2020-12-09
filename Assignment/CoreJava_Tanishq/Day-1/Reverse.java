package exercise_day01;

// reverse an array of integer values

public class Reverse {

	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,6};
		for(int i = 0; i < a.length / 2; i++)
		  {
		    int temp = a[i];
		    a[i] = a[a.length - i - 1];
		    a[a.length - i - 1] = temp;
		  }
		System.out.print("The reverse array is: ");   
		for (int j=0; j<a.length; j++)
		{
			System.out.print(a[j]);
		}
		  
	}
}
