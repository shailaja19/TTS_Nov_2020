
//Declare three number variables with value as 12,25,89 find the greatest number and display.



public class Question1 {
     
    public static void main(String args[]) {
      int x=12;
      int y=25;
      int z=89;
      
     if((x>y)&&(x>z)){
         System.out.println("Max.no"+ x);
     }
     else if((y>x)&&(y>z)){
         System.out.println("Max.no"+ y);
     }
     else{
         System.out.println("Max.no"+ z);
     }
    }
}