package exercise_day01;

// To replace Ovals with dollar symbol in the string

public class Stringvalue {

	 public static void main(String[] args) 
	 {   
		 String s = "Java training day";
	     char ch[]= s.toCharArray();
	     for (int i = 0; i < ch.length; i++)
	        {
	               if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
	               {
	                ch[i]='$'; 
	               }   
	        }
	        for (int i = 0; i < ch.length; i++) 
	        {
	            System.out.print(ch[i]);
	        }
	 }
}
