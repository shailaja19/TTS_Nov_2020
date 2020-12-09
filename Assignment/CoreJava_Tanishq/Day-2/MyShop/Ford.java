package MyShop;

public class Ford extends Car{

	int year;
	int manufacturerdiscount;
	
	Ford(int a, double b, String c, int d, int e)
	{
		super(a,b,c);
		this.year=d;
		this.manufacturerdiscount=e;
	}
	
	public double getSalePrice()
	{
		return(super.getSalePrice()-manufacturerdiscount);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getManufacturerdiscount() {
		return manufacturerdiscount;
	}

	public void setManufacturerdiscount(int manufacturerdiscount) {
		this.manufacturerdiscount = manufacturerdiscount;
	}

	@Override
	public String toString() {
		return "Ford [ Year=" + getYear() + ", Manufacturer discount=" + manufacturerdiscount + ", Sale Price ="
				+ getSalePrice() + ", Speed= "+ getSpeed()+ ", RegularPrice=" + getRegularPrice()
				+ ", Color=" + getColor() + "]";
	}

	
	
	
}
