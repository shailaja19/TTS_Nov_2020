
//Read the String and replace Ovals with dollar symbol program
import java.lang.*;
import java.util.*;
public class Question7{

   
    public static void main(String args[]) {
     String str = "Welcome to Java Programming";    
      str = str.replaceAll("[AaEeIiOoUu]", "@");  
      System.out.println(str);   
     }
    }
