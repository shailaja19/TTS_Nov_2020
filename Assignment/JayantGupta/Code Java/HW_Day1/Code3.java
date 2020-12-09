package hw;

public class Code3 {
	public void cube(int a) {
		double b= Math.pow(a,3);
		System.out.print(b);
	}
	public static void main(String args[])
	{
		Code3 c = new Code3();
		int i=5;
		c.cube(i);
	}
}
