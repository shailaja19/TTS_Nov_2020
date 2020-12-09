package HW_Day3;

public class Employee {
	int empId;
	String empName;
	double empSal;
	
	Employee(int eid,String ename, double esal)
	{
		this.empId=eid;
		this.empName=ename;
		this.empSal=esal;
	}
	public void display() {
//		System.out.println(empId);
//		System.out.println(empName);
//		System.out.println(empSal);
	}
	
	public double salCal() {
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
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", salCal()=" + salCal()
				+ "]";
	}

}


