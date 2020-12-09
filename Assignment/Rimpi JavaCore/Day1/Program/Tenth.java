package Program;

public class Tenth {
	public static void main (String[] args)
	{
 
		int array[] = {56,67,45,89,43,23,34};
 
		int largest1, largest2, temp;
 
		largest1 = array[0];
		largest2 = array[1];
 
		if (largest1 < largest2)
		{
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}
 
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] > largest1)
			{
				largest2 = largest1;
				largest1 = array[i];
			}
			else if (array[i] > largest2 && array[i] != largest1)
			{
				largest2 = array[i];
			}
		}
 
		System.out.println ("The First largest is " + largest1);
		System.out.println ("The Second largest is " + largest2);
 
	}
}