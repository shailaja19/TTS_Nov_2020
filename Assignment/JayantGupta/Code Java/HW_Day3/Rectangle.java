package HW_Day3;

public class Rectangle extends Shape{

	Rectangle(float length, float breadth, float width)
	{
		super(length, breadth, width);
	}
	public double radius()
	{
		return (Math.sqrt(Math.pow(length,2)+Math.pow(breadth,2)))/2;

	}
	

}
