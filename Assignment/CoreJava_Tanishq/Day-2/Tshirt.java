package java_day_02;

public class Tshirt {
	
	String color;
    String material;
	String design;
	
	public Tshirt(String c, String m, String d)
	{
		color=c;
		material=m;
		design=d;
	}
	
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getMaterial() {
		return material;
	}



	public void setMaterial(String material) {
		this.material = material;
	}



	public String getDesign() {
		return design;
	}



	public void setDesign(String design) {
		this.design = design;
	}



	@Override
	public String toString() {
		return "Tshirt [color=" + color + ", material=" + material + ", design=" + design + "]";
	}



	public static void main(String args[])
	{
		Tshirt s=new Tshirt("black","b","c");
		System.out.println(s);
		
     	Tshirt l=new Tshirt("a","cotton","c");
     	System.out.println(l);
     	
		Tshirt xl=new Tshirt("a","b","pattern");
		System.out.println(xl);
		
	}

	
	
}
