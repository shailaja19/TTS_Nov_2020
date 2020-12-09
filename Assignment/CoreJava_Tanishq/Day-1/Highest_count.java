package exercise_day01;
import java.util.*;
// Read the highest count of duplicates

public class Highest_count {

	public static void main(String args[])
	{
		int a[]= {2,4,7,4,9,4};
		Arrays.sort(a);
		int max=0;
		for(int i=0; i<a.length; i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
				if(count>max)
					max=count;
			}
			
		}
		System.out.println(max);
	}
}
