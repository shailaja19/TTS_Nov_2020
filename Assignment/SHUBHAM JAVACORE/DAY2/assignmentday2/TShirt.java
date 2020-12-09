package com.sonata.assignmentday2;

public class TShirt{
	String color;
	String material;
	String design;
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}
	public void setMaterial(String material){
		this.material=material;
	}
	public String getMaterial(){
		return this.material;
	}
	public void setDesign(String design){
		this.design=design;
	}
	public String getDesign(){
		return this.design;
	}
}

class Ans2{
	public static void main(String args[]){
		TShirt tshirt1 = new TShirt();
		tshirt1.setColor("Black");
		tshirt1.setMaterial("Cotton");
		tshirt1.setDesign("Small");
		
		TShirt tshirt2 = new TShirt();
		tshirt2.setColor("White");
		tshirt2.setMaterial("Silk");
		tshirt2.setDesign("Large");

		TShirt tshirt3 = new TShirt();
		tshirt3.setColor("Blue");
		tshirt3.setMaterial("Polyester");
		tshirt3.setDesign("Xtra Large");

		System.out.println(tshirt1.getColor() + " " + tshirt1.getMaterial() + " " + tshirt1.getDesign());
		System.out.println(tshirt2.getColor() + " " + tshirt2.getMaterial() + " " + tshirt2.getDesign());
		System.out.println(tshirt3.getColor() + " " + tshirt3.getMaterial() + " " + tshirt3.getDesign());
	}
}