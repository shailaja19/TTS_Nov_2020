package MyOwnAutoShopProject;

public class Car {
	int speed;
	double regularPrice;
	String color;
//	double newprice;
//	Car(){}
	Car(int sp, double rePrice, String col)
	{
		this.speed=sp;
		this.regularPrice=rePrice;
		this.color=col;
	}
	public double getSalePrice() {
		return regularPrice;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getRegularPrice() {
		return regularPrice;
	}
	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color + "]";
	}
}