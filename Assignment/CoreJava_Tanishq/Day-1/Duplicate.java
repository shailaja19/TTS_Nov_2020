package exercise_day01;

//Searches for duplicate value 

public class Duplicate {

	public static void main(String[] args) 
	{        
        int a[] = {1, 2, 3, 4, 3, 6, 9, 4, 2};   
          
        System.out.println("Duplicate values in the array: ");  
        
        for(int i = 0; i < a.length; i++) 
        {  
            for(int j = i + 1; j < a.length; j++) 
            {  
                if(a[i] == a[j])
                	
                    System.out.println(a[j]);  
            }  
        }  
    }  
}
