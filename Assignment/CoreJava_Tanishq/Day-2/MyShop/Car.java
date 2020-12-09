package MyShop;

public class Car {
	
		int speed;
		double regularPrice;
		String color;
		
		Car(int a, double b, String d)
		{
			this.speed=a;
			this.regularPrice=b;
			this.color=d;
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

		public double getSalePrice()
		{
			return regularPrice;
		}

		@Override
		public String toString() {
			return "Car [Speed=" + speed + ", Regular Price=" + regularPrice + ", Color=" + color + ", Sale Price=" + getSalePrice() + "]";
		}

		

}
