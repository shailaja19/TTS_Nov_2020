package Assignment;

public class specificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int num=6;
		boolean specific=false;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==num) 
			{
				specific=true;
				break;
			}
				
		}
		if(specific) {
			System.out.println("Specific value is present");
		}
		else {
			System.out.println("Specific value is not present");
		}
		

	}

}
