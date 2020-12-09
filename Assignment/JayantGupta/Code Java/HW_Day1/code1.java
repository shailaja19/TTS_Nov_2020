package hw;

public class code1 {
	public void greatest(int a, int b, int c)
	{
		 if(a>b && a>c)
		 {
			 System.out.println(a);
		 }
		 else if(b>a && b>c)
		 {
			 System.out.println(b);
		 }
		 else if(c>a && c>b)
		 {
			 System.out.println(c);
		 }
	}
	public static void main(String args[]) 
	{
		code1 ca= new code1();
		int a=12;
		int b=25;
		int c=89;
		ca.greatest(a,b,c);

	}
}
