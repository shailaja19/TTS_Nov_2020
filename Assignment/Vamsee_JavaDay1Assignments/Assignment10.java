package coreJavaDay1;

public class Assignment10 {
	public static void main(String[] arg) {
		int[] array = {1,2,3,66,5,4,321,55,89,10};
		int first = -1;
		int second = -1;
		for(int i=0;i<array.length;i++) {
			if(array[i]>second) {
				if(array[i]>first) {
					second = first;
					first = array[i];
				}
				else {
					second = array[i];
				}
			}
		}
		System.out.println(first);
		System.out.println(second);
	}
}
