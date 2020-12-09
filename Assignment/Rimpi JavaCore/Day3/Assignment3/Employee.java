package Assignment3;

abstract class Employee {
		int empId;
		String empName;
		double empSal;
		public void display() {
			System.out.println("Employee ID: "+empId);
			System.out.println("Employee Name: "+empName);
		}
	//will use this method to get salaries of employees
		abstract void SalCal();

}

class empInfo{
	 public static void main(String[] args) {
		 Employee e1 = new Manager();
		 e1.empId= 785;
		 e1.empName= "Jack";
		 e1.display();
	     e1.SalCal();
	     
	     Employee e2 = new Developer();
	     e2.empId= 675;
		 e2.empName= "Ryan";
		 e2.display();
		 e2.SalCal();
		
		 Employee e3 = new Tester();
		 e3.empId= 547;
		 e3.empName= "Prince";
		 e3.display();
		 e3.SalCal();	 
	 }

 }
 