package Program;

//Calculate the sum of all values in array
public class Fourth {
	public static void main(String[] args) {
		
		//array of values
		int[] values= {1,2,3,4,5,6};
		int sum=0;
		
		//iterating through each value of array
		for(int value:values) {
			sum+=value;
			
		}
		System.out.println("Sum = " + sum);
	}
	

}
