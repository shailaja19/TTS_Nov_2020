

//Question 3

public class Tshirt {
    String color;
    String material;
    String design;
    Tshirt(){}
    Tshirt(String col,String mat,String des){
        this.color=col;
        this.material=mat;
        this.design=des;
    }
    void display(){
        System.out.println(color);
        System.out.println(material);
        System.out.println(design);
    }
    public static void main(String args[]) {
          Tshirt sm= new Tshirt("red","cotton","df");
          sm.display();
          Tshirt mm= new Tshirt("blue","wool","mf");
          mm.display();
          Tshirt xl=new Tshirt("black","poly","jk");
          xl.display();
          
    }
}