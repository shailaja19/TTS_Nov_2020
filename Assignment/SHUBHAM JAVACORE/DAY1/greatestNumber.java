package Assignment;
public class greatestNumber {
	public static void main(String args[]) {
		int a=12;
		int b=25;
		int c=89;
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
		}
		else if(b>c) {
			if(b>a) {
				System.out.println(b);
			}
		}
		else {
			System.out.println(c);
		}
	}

}
