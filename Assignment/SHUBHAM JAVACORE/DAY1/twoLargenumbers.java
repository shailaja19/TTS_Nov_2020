package Assignment;
import java.util.Arrays;  


public class twoLargenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,44,55,66,87};
		Arrays.sort(arr);
		
		System.out.println("first larger nuber: " + arr[arr.length-1]);
		System.out.println("second larger number: " +arr[arr.length-2]);
		
		}

}


