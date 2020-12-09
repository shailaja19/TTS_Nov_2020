package Assignment3.Shape;

public abstract class Shape
{
   private double length; 
   private double width;  

   // Set length and width
   public void setValues(double length, double width)
   {
      this.length = length;
      this.width = width;
   }

   //Get length
   public double getLength() 
   {
       return length;
   }
     
   //Get width
   public double getWidth() 
   {
       return width;
   } 

  

   public abstract double getArea();
}
