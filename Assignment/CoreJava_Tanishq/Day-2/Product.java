package java_day_02;

public class Product {


	int ProID;
	String ProName;
	int ProPrice;

public static void main(String args[])
{
	Product p=new Product();
	p.ProID = 1;
	p.ProName = "Watch";
	p.ProPrice = 10000;
	
	System.out.println("Product ID is "+p.ProID+" and product name is "+p.ProName+" and the price before GST is "+p.ProPrice);
	
	double GST;
	GST = (p.ProPrice*(0.18));
	System.out.println("The GST on this product is: "+GST+(" rs"));
	p.ProPrice+=GST;
	
	System.out.println("The price after adding GST is: "+p.ProPrice);	
		
}
}
