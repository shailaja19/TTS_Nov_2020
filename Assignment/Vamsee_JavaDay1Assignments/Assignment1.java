package coreJavaDay1;

public class Assignment1 {
	public static void main(String arg[]) {
		int a = 12;
		int b = 25;
		int c = 89;
		if(a>b) {
			if(a>c)
				System.out.print(a);
			else
				System.out.print(c);
		}
		else {
			if(b>c)
				System.out.print(b);
			else
				System.out.print(c);
		}
	}
}
