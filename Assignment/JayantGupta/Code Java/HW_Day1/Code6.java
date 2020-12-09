package hw;

public class Code6 {
	public void reverse(int a[])
	{
		int b[]= new int[a.length];
		for(int j=0;j<a.length;j++)
		{
			b[j]=a[a.length-j-1];		
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	public static void main(String args[])
	{
		Code6 c= new Code6();
		int a[]= {1,2,3,4,5};
		c.reverse(a);
}
}
