package hw;

public class Code4 {
	public void sum(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			temp=temp+arr[i];
		}
		System.out.print(temp);
		
	}
	public static void main(String args[])
	{
		Code4 c= new Code4();
		int a[]= {1,2,3,4,5,6,7};
		c.sum(a);
	}
}
