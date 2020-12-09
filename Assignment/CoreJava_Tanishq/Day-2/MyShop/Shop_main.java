package MyShop;

public class Shop_main {

	public static void main(String args[])
	{
		Sedan s=new Sedan(100,2500.00,"Black",100);
		Ford f1=new Ford(120,3000.00,"Red",2018,500);
		Ford f2=new Ford(150,3500.00,"Grey",2020,300);
		Car c=new Car(200,5000.00,"Blue");
		
		System.out.println(s);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(c);
	}
}
