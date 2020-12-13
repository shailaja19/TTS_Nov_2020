
//Write a program to identify duplicate values in an array

public class Question8{
    
   
    public static void main(String args[]) {
        int[] a={2,2,2,3,3,2};
      
       int k=0;
       int[] b= new int[10];
      for(int i=0;i<6;i++){
          for(int j=i+1;j<6;j++){
              if(a[i]==a[j] && (i!=j)){
              //  System.out.println(a[i]);
                b[k]=a[i];
                k++;
              }
             
          }
          
           
      }
      int c=k;
      for( k=0;k<c;k++){
          if(b[k]!=b[k+1]){
              
          
          System.out.println(b[k]);
          }
      }
     
     }
    }
