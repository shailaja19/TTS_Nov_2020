
//Write a program to identify 2 large numbers in an array.

public class Question10{
	
	public void largest2(int al[]){
	    int[] bl= new int[al.length];
 
		for (int i = 0; i < al.length; i++)
		{
		    for(int j=i+1;j<al.length;j++){
			  
			{
				if(al[i]>al[j]){
				    int x=al[i];
				    al[i]=al[j];
				    al[j]=x;
				}
			}
			
		}
		
	}
	System.out.println ("The First largest is " + al[al.length-1]);
		System.out.println ("The Second largest is " + al[al.length-2]);
	
	    
	
	
	}
	public static void main (String[] args)
	{
	  Question10 q= new Question10();
	  int r[]={3,445,55,221,22};
	  q.largest2(r);

 
	}
}