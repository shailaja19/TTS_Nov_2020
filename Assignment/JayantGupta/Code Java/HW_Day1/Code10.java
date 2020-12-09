package hw;

public class Code10 {
	public void largest2(int a[])
	{
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-1]);
		System.out.println(a[a.length-2]);
	}
	public static void main(String args[])
	{
		Code10 c= new Code10();
		int a1[]= {1,2,2,13,2,3,4,5};
		c.largest2(a1);
	}
}
