public class Employee {
    int empId;
    String empName;
    double empSal;
    
    
    public double salCal() {
    	int basic=16000;
    	int extra=0;
    	return empSal=basic +extra;
    }
    public void display() {
    	System.out.println(empId);
    	System.out.println(empName);
    	System.out.println(empSal);
    }
}