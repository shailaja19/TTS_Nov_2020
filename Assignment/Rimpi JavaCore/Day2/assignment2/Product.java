package com.sonata.assignment2;

public class Product {
	//The properties ProID, ProName
	//ProPrice display the information and ProPrice will be added additional tax of GST .
	int ProId;
	String ProName;
	double ProPrice;
}

 

class Bill{
	public static void main(String args[]) {
		Product p1=new Product();
		p1.ProId=100;
		p1.ProName="Phone";
		p1.ProPrice=12000;
		double gst;
		double totalbill;
		gst=p1.ProPrice*.12;
		totalbill=p1.ProPrice+gst;
		System.out.println("ProductId: " +p1.ProId+ " ProductName:"+p1.ProName+" Product Price: "+p1.ProPrice+" Total Bill:"+totalbill);
		
	}
	
}