package com.sonata.assignmentday3.SHAPE;

/**
 * This program demonstrates polymorphic behavior.
 */

public class Area
{
    public static void main(String[] args)
    {
        Shape shape;
        
        // assign subclass reference to subclass variable
        Rectangle rect = new Rectangle();
        
        // shape points to the object rectangle.
        shape = rect;

        // Set data in Rectangle's object 
        shape.setValues(88, 5);
        
        //Display the area of rectangle
        System.out.println("Area of rectangle : " + shape.getArea());
        
        
        // assign subclass reference to subclass variable
        Square sqr = new Square();
        
        // shape points to the object Square.
        shape = sqr;

        // Set data in Square's object 
        shape.setValues(50, 50);
        
        //Display the area of rectangle
        System.out.println("Area of square : " + shape.getArea());
        
        // assign subclass reference to subclass variable
        Triangle tri = new Triangle();
        
        // shape points to the object rectangle.        
        shape = tri;
        
        // Set data in Triangle's object         
        shape.setValues(36,4);
        
        //Display the area of triangle        
        System.out.println("Area of triangle : " + shape.getArea());
    }
}