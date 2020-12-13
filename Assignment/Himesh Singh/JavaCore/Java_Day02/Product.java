




//Question2

public class Product {
	int ProID;
	String ProName;
	double ProPrice;
	Product(int id,String n, double pr){
		this.ProID=id;
		this.ProName=n;
		this.ProPrice=pr;
	}
	public void display()
	 {
	    ProPrice=ProPrice + 0.18*ProPrice;
		System.out.println(ProID);
		System.out.println(ProName);
		System.out.println("Price after gst " + ProPrice);
	 }
	public static void main(String args[])
	{
		Product p1= new Product(123,"xyz",2000);
		p1.display();
	}
}