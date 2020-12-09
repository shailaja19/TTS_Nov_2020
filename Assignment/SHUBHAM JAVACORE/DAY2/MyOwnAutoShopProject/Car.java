package com.sonata.MyOwnAutoShopProject;

class Car {
		int speed;
		double regularPrice;
		String color;
		
		Car(int a,double b,String c){
			this.speed=a;
			this.regularPrice=b;
			this.color=c;
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

