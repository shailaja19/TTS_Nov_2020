




//Question4

 class Car {
	int speed;
	double regularPrice;
	String color;
	double newprice;
	Car(){}
	Car(int sp, double rePrice, String col)
	{
		this.speed=sp;
		this.regularPrice=rePrice;
		this.color=col;
	}
	 double getSalePrice() 
	{
		newprice=regularPrice;

		return newprice;
	}
	void display() {
		System.out.println(newprice);
	}
}

 class Ford extends Car{
	int year;
	int manufacturerDiscount;
	Ford(){}
	Ford(int sp2, double rePrice2, String col2,int y,int manuDis){
		super(sp2,rePrice2,col2);
		this.year=y;
		this.manufacturerDiscount=manuDis;
	}
	 double getSalePrice() {
		newprice=regularPrice-manufacturerDiscount;
		return newprice;
	}
}

 class Sedan extends Car{
	int length;
	Sedan(){}
	Sedan(int sp3, double rePrice3, String col3, int len){
		super(sp3,rePrice3,col3);
		this.length=len;
	}
	public double getSalePrice() {
		if(length>20)
		{
			newprice=regularPrice- (0.05*regularPrice);
		}
		else
		{
			newprice=regularPrice- (0.10*regularPrice);
		}

		return newprice;
	}
}

 class Truck extends Car{
	int weight;

	Truck(){}
	Truck(int sp1, double rePrice1, String col1, int w){
		super(sp1,rePrice1,col1);
		this.weight=w;
	}
	double getSalePrice()
	{
		if(weight>2000)
		{
			newprice= (regularPrice-(0.10*regularPrice));
		}
		else
		{
			newprice=(regularPrice-(0.20*regularPrice));
		}

		return newprice;
	}

}

public class MyOwnAutoShop {
	public static void main(String args[])
	{
		Sedan s1= new Sedan(150,1500000,"red",12);
		s1.getSalePrice();
		s1.display();

		Ford f1= new Ford(120,550000,"gold",2017,50000);
		Ford f2= new Ford(200,400000,"White",2019,100000);
		f1.getSalePrice();
		f1.display();
		f2.getSalePrice();
		f2.display();
		
		Car c1 = new Car(140,200000,"blue");
		c1.getSalePrice();	
		c1.display();
	}
}