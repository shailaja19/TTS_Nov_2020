package com.sonata.MyOwnAutoShopProject;


//Create MyOwnAutoShop class which contains the main() method.  Perform the following within the main() method.
//Create an instance of Sedan class and initialize all the fields with appropriate values.  Use super(...) method in the constructor for initializing the fields of the super class.
//•	Create two instances of the Ford class and initialize all the fields with appropriate values.  Use super(...) method in the constructor for initializing the fields of the super class.
//•	Create an instance of Car class and and initialize all the fields with appropriate values.
//•	Display the sale prices of all instance.

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Car c1=new Car(210,777777,"White");
		Sedan s1=new Sedan(120,6666,"Grey",21);
		Truck t1=new Truck(80,10000,"HYbrib",2001);
		Ford f1=new Ford(240,99999,"Black",2020,9999);
		
		System.out.println(c1);
		System.out.println(s1);
		System.out.println(t1);
		System.out.println(f1);

	}

}
