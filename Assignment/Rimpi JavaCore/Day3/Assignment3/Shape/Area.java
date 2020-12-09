package Assignment3.Shape;

public class Area
{
    public static void main(String[] args)
    {
        Shape shape;
        
        Rectangle rect = new Rectangle();
        shape = rect;
        shape.setValues(20, 10);
        System.out.println("Area of rectangle is : " + shape.getArea());
        
        Square sqr = new Square();
        shape = sqr;
        shape.setValues(25, 25);
        System.out.println("Area of square is : " + shape.getArea());
        
        Traingle tri = new Traingle();   
        shape = tri;
        shape.setValues(15,10);
        System.out.println("Area of triangle is : " + shape.getArea());
    }
}