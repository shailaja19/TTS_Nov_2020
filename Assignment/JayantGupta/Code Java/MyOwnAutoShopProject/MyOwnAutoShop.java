package MyOwnAutoShopProject;

public class MyOwnAutoShop {
	public static void main(String args[])
	{
		Sedan s1= new Sedan(160,1000000,"red",15);
//		s1.getSalePrice();
//		s1.display();
//		Sedan s2= new Sedan(160,1000000,"red",25);
//		s2.getSalePrice();
//		s2.display();
		Ford f1= new Ford(200,500000,"Silver",2017,50000);
		Ford f2= new Ford(180,600000,"White",2019,1000);
//		f1.getSalePrice();
//		f1.display();
//		f2.getSalePrice();
//		f2.display();
		
		Car c1 = new Car(140,200000,"Black");
//		c1.getSalePrice();	
//		c1.display();
		System.out.println(s1);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(c1);
	}
}
