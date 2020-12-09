package hw;
import java.util.*;
public class Code9 {
	public static void main(String args[])
	{
		int count=0;
		ArrayList<Integer> l= new ArrayList<Integer>();
		int a[]= {1,2,4,2,1,1,3,4,3,4,4,2,3,3};
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			l.add(count);
		}
		Collections.sort(l);
		System.out.print(l.get(l.size()-1));
	}
}
