package HW_Day3;

public class Square extends Shape {

	Square(float length) 
	{
		super(length, length, length);
	}
	public double radius()
	{
		return ((length*Math.sqrt(2)))/2; 
		
	}
	
}