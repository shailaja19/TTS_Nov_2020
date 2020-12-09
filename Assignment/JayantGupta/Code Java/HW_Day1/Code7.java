package hw;

public class Code7 {
	public void str1(String s)
	{
		String s1=s.toLowerCase();
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				c[i]='$';
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
	}
	public static void main(String args[])
	{
		Code7 c= new Code7();
		String str = "A quick brown fox.";
		c.str1(str);
	}
}
