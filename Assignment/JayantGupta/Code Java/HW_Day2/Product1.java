package HW_DAY2;

public class Product1 {
	int ProID;
	String ProName;
	double Price;
	
	Product1 (int id,String name, double pri){
		this.ProID=id;
		this.ProName=name;
		this.Price=pri;
	}

	public int getProID() {
		return ProID;
	}

	public void setProID(int proID) {
		ProID = proID;
	}

	public String getProName() {
		return ProName;
	}

	public void setProName(String proName) {
		ProName = proName;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Product1 [ProID=" + ProID + ", ProName=" + ProName + ", Price=" + Price + "]";
	}
}
