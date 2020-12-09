package HW_Day3;

public class Shape {
	float length;
	float width;
	float breadth;
	
	Shape(float length,float breadth,float width){
		this.length=length;
		this.breadth=breadth;
		this.width=width;	
	}
	
	public double radius()
	{
		return 0;
		
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Shape [length=" + length + ", width=" + width + ", breadth=" + breadth + ", radius()=" + radius() + "]";
	}


}
