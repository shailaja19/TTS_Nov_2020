package coreJavaDay1;

public class Assignment9 {
	public static void main(String arg[]) {
		int[] array = {1,2,2,3,3,3,6,4,4,4,4,5,6,1,3,5,3};
		int ans = 0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			int temp = 1;
			for(int j=i+1; j<array.length; j++) {
				if (array[i] == array[j]) {
					temp+=1;
				}
			}
			if(temp>count) {
				count = temp;
				ans = array[i];
			}
		}
		System.out.print(ans);
		
	}
}
