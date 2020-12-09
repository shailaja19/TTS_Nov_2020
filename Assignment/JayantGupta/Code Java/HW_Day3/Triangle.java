package HW_Day3;

public class Triangle extends Shape {

	Triangle(float length, float breadth, float width) 
	{
		super(length,breadth , width);
	}
	public double radius()
	{
		return (length*breadth*width)/(Math.sqrt(length+breadth+width)*(length+breadth-width)*(length-breadth+width)*(-length+breadth+width));
	
	}
	
}
