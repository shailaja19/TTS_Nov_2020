package MyShop;

public class Sedan extends Car {
	
	int length;
	Sedan(int a, double b, String c, int d)
	{
		super(a,b,c);
		this.length=d;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getSalePrice()
	{
		if(length>20)
			return (regularPrice*0.95);
		else
			return(regularPrice*0.90);
	}

	@Override
	public String toString() {
		return "Sedan [length=" + length + ", Speed=" + speed + ", Regular Price=" + regularPrice + ", Color=" + color
				+  ", Sale Price=" + getSalePrice() +  "]";
	}

	
}

