package hw;
import java.util.*;

public class Code8 {
	public static void main(String args[])
	{
		List<Integer> l= new ArrayList<Integer>();
		int a[]= {1,2,4,2,1,1,3,4,3,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					l.add(a[j]);
				}
			}
		}
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i)==l.get(j))
				{
					l.remove(j);
				}
			}
		}
		System.out.print(l);
	}
}