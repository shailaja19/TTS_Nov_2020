package Program;
//program to find specific number in array
public class Fifth {
	public static void main(String[] args) {
		//array
		int arr1[]= {2,7,6,5,9,4};
		//assigning particular number to find out whether it's there or not
		int snum=9;
		//for loop to checj with each array element
		for(int i=0;i<arr1.length;i++) {
			//if it's matches print the message number found
			if(arr1[i]==snum) {
				System.out.println("Number Found");
			}
		}
	}

}
