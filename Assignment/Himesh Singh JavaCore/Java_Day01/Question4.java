
//Write a java program to sum values of an array. For example a[5] ={1,2,3,4,5,6} the sum of the values is 21.


public class Question4{
    
   
    public static void main(String args[]) {
        int[] a={1,2,3,4,5,6};
      int sum=0;
      for(int i=0;i<6;i++){
          sum+=a[i];
      }
      System.out.println(sum);
     }
    }
