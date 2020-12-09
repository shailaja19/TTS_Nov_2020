package coreJavaDay1;

public class Assignment5 {
	public static void main(String arg[]) {
		int key = 43;
		boolean found = false;
		int[] array = {1,5,6,21,43,6,9,100};
		for(int i=0; i<array.length; i++) {
			if(key == array[i]) {
				System.out.println("Found");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Not found");
		}
	}
}
