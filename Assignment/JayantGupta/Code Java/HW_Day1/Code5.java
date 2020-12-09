package hw;

public class Code5 {
	public void value(int a[],int n)
	{
		int m=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				m=1;
				break;
			}
			else
			{
				m=-1;
			}
		}
		if(m==1)
		{
			System.out.println("Contains value");
		}
		else
		{
			System.out.println("Not Contains value");
		}	
	}
	public static void main(String args[])
	{
		Code5 c= new Code5();
		int temp=5;
		int arr[]= {1,2,3,4,5,6,7};
		c.value(arr,temp);	
	}
}
