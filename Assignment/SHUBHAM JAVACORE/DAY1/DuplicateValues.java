package Assignment;

public class DuplicateValues 
{ 
	 public static void main(String[] args) {      
         
	        int arr[] = new int [] {1, 1, 3, 4, 2, 7, 8, 9, 4,9};   
	          
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  {
	                
	                    System.out.print(arr[j] +" ");  
	                }
	            }  
	        }  
	    }  
}
