package HW_DAY2;

public class Product {
	int ProID;
	String ProName;
	double Price;
	Product(int id,String name, double pri){
		this.ProID=id;
		this.ProName=name;
		this.Price=pri;
	}
	public void display()
	 {
		double ProPrice=Price + 0.18*Price;
		System.out.println(ProID);
		System.out.println(ProName);
		System.out.println("Price after tax inclusion " + ProPrice);
	 }
	public static void main(String args[])
	{
		Product p1= new Product(123,"Shirt",5000);
		p1.display();
	}
}
