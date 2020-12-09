//Create a Shape class to draw a diagram like rectangle, square, triangle , with same properties like length , height, width and calculate the radius  of it by overriding the method in respective class 
	package com.sonata;

	public class Shape {
                       int length;
                      int height;
	     int width;
	   Shape(int length,int height,int width){
	    	 this.length=length;
	    	 this.height=height;
	    	 this.width=width; }
	
	     double radius() {
	    	 return 0;
	     }
	}
	public class Triangle extends Shape {
		Triangle(int length,int height,int width){
	  	  super(length, height, width);
	  	  
	    }
	    double radius() {
	  	  return(length*width*height)/(Math.sqrt(length+width+height)*(length+width-height)*(length-width+height)*(-length+width+height));
	    }
	}
	public class Square extends Shape {
		Square(int length){
	  	  super(length,0,0);
	  	  
	    }	    double radius() {
	  	  return((length*Math.sqrt(2)))/2;
	    }
	}
	public class Rectangle extends Shape {
	              Rectangle(int length,int width){
	            	  super(length, 0, width);
	            	  
	              }
	              double radius() {
	            	  return(Math.sqrt(Math.pow(length,2)+Math.pow(width,2)))/2;
	              }
	}
public class Testmain {
     public static void main(String[] args) {
    	 Rectangle r1=new Rectangle(10,20);
    	 System.out.println(r1);
    	 Square s1=new Square(10);
    	 System.out.println(s1);
    	 Triangle t1=new Triangle(4,2,5);
    	 System.out.println(t1);
    	 
     }
}
