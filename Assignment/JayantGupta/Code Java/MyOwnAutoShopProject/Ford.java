package MyOwnAutoShopProject;

public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	Ford(int sp2, double rePrice2, String col2,int y,int manuDis){
		super(sp2,rePrice2,col2);
		this.year=y;
		this.manufacturerDiscount=manuDis;
	}
	public double getSalePrice() {
		regularPrice=regularPrice-manufacturerDiscount;
//		System.out.println(newprice);
		return regularPrice;
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
	@Override
	public String toString() {
		return "Ford [year=" + year + ", manufacturerDiscount=" + manufacturerDiscount + ", speed=" + speed
				+ ", regularPrice=" + regularPrice + ", color=" + color + "]";
	}

	
	
}
