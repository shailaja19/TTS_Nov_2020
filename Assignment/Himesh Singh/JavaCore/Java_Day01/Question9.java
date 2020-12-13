
//Read the highest count of duplicates from array of integers
import java.util.*;
public class Question9{
    
   
    public static void main(String args[]) {
        int[] a={2,2,2,3,3,2};
      Arrays.sort(a);
       int k;
      
     int max=0;
      for( k=0;k<a.length;k++){
          int count=1;
          for(int l=k+1;l<a.length;l++)      
          if(a[k]==a[l] ){
              count++;
          
          }
          if(count>max){
              max=count;
      }
      }
      System.out.println(max);
     
     }
    }
