package HW_DAY2;

public class TShirt {
	String color;
	String material;
	String design;
	TShirt(){}
	TShirt(String col, String mat, String des){
		this.color=col;
		this.material=mat;
		this.design=des;
	}
	public static void main(String args[])
	{
		TShirt s = new TShirt();
		TShirt m = new TShirt();
		TShirt l = new TShirt();
	}
}
