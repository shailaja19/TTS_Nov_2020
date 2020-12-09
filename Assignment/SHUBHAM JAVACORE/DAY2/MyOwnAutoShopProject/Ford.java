package com.sonata.MyOwnAutoShopProject;

public class Ford extends Car{
//	•	double getSalePrice();  
// From the sale price computed from Car class, subtract the manufacturerDiscount.
	int year;
	int manufacturerDiscount;
	Ford(int a,double b,String c,int d,int e){
		super(a,b,c);
		this.year=d;
		this.manufacturerDiscount=e;
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}
	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	public double getSalePrice() {
		return(super.getSalePrice()-manufacturerDiscount);
		
	}
	@Override
	public String toString() {
		return "Ford [year=" + year + ", manufacturerDiscount=" + manufacturerDiscount + ", speed=" + speed
				+ ", regularPrice=" + regularPrice + ", color=" + color + ", getYear()=" + getYear()
				+ ", getManufacturerDiscount()=" + getManufacturerDiscount() + ", getSalePrice()=" + getSalePrice()
				+ "]";
	}

}
