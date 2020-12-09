package MyOwnAutoShopProject;

public class Truck extends Car{
	int weight;

	Truck(int sp1, double rePrice1, String col1, int w){
		super(sp1,rePrice1,col1);
		this.weight=w;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public double getSalePrice()
	{
		if(weight>2000)
		{
			regularPrice= (regularPrice-(0.10*regularPrice));
		}
		else
		{
			regularPrice=(regularPrice-(0.20*regularPrice));
		}
//		System.out.println(newprice);
		return regularPrice;
	}

	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color
				+ "]";
	}

}
