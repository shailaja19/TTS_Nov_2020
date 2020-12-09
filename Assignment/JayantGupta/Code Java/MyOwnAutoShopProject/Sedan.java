package MyOwnAutoShopProject;

public class Sedan extends Car{
	int length;
	Sedan(int sp3, double rePrice3, String col3, int len){
		super(sp3,rePrice3,col3);
		this.length=len;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getSalePrice() {
		if(length>20)
		{
			regularPrice=regularPrice- (0.05*regularPrice);
		}
		else
		{
			regularPrice=regularPrice- (0.10*regularPrice);
		}
//		System.out.println(newprice);
		return regularPrice;
	}
	@Override
	public String toString() {
		return "Sedan [length=" + length + ", speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color
				+ "]";
	}

}
