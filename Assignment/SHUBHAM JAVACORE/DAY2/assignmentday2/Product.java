package com.sonata.assignmentday2;

public class Product {
	//The properties are ProID, ProName, 
	//ProPrice display the information and ProPrice will be added additional tax of GST .
	int ProId;
	String ProName;
	double ProPrice;
}

 

class Bill{
	public static void main(String args[]) {
		Product p1=new Product();
		p1.ProId=121;
		p1.ProName="Mobile";
		p1.ProPrice=10000;
		double gst;
		double totalbill;
		gst=p1.ProPrice*.18;
		totalbill=p1.ProPrice+gst;
		System.out.println("ProductId: " +p1.ProId+ " ProductName:"+p1.ProName+" Product Price: "+p1.ProPrice+" Total Bill:"+totalbill);
		
	}
	
}
