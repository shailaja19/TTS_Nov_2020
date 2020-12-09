package MyShop;

public class Truck extends Car {

	int weight;
	
	Truck(int a, double b, String c, int d)
	{
		super(a,b,c);
		this.weight=d;
	}
	
	public double getSalePrice()
	{
		if(weight>2000)
			return (regularPrice*0.90);
		else
			return(regularPrice*0.80);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Truck [weight=" + weight + "]";
	}
	
}

