package HW_Day3_Part2;

public abstract class Employee {
	int empId;
	String empName;
	double basicpay;
	float leaves;
	Address obj;
	public abstract void calculateSalary();
	
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
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public float getLeaves() {
		return leaves;
	}
	public void setLeaves(float leaves) {
		this.leaves = leaves;
	}
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", basicpay=" + basicpay + ", leaves=" + leaves
				+ ", obj=" + obj + "]";
	}


	
}
