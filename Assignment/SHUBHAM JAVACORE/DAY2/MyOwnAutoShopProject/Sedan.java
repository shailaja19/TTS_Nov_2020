package com.sonata.MyOwnAutoShopProject;

public class Sedan  extends Car{
//	double getSalePrice();  
	// If length > 20 feet, 5% discount, Otherwise, 10% discount.
	int length;
	Sedan(int a,double b,String c,int e){
		super(a,b,c);
		this.length=e;
	}
	
	public double getSalePrice() {
		if(length>20) {
			return(Math.round(regularPrice*0.95));
		}
		else {
			return(Math.round(regularPrice*0.90));
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Sedan [length=" + length + ", speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color
				+ ", getSalePrice()=" + getSalePrice() + ", getLength()=" + getLength() + "]";
	}
	
	


}