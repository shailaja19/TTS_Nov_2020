public class Testmain {
     public static void main(String[] args) {
    	 Tester t1=new Tester();
    	 t1.empId=12233;
    	 t1.empName="Ravi";
    	 t1.salCal();
         t1.display();
         Developer d1=new Developer();
    	 d1.empId=12333;
    	 d1.empName="Sheela";
    	 d1.salCal();
         d1.display();
         Manager m1=new Manager();
    	 m1.empId=12243;
    	 m1.empName="Vinay";
    	 m1.salCal();
         m1.display();
        
    	 
     }
}}