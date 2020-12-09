package java_day_03;

public class Shape {

	double length;
	double height;
	double width;
	double radius;
	
	Shape(double a, double b, double c)
	{
		this.length=a;
		this.height=b;
		this.width=c;
	}
	
	public double calRad()
	{
		return radius;
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Shape [length=" + length + ", height=" + height + ", width=" + width + ", radius=" + radius + "]";
	}
	
	
}
