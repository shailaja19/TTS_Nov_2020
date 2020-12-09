package java_day_03;

public class Employee {
	
	int empId;
	String empName;
	double empSal;
	
	Employee(int a, String b, double c)
	{
		this.empId=a;
		this.empName=b;
		this.empSal=c;
	}
	public void Display() {}
	
	public double salCal() 
	{
		return empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	

}
