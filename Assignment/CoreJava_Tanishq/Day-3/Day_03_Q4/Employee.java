package Day_03_Q4;

abstract class Employee {

	int empID;
	String empName;
	double basic;
	int leave_rem;
	
	Address obj;
	
	public abstract void calculateSalary();
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public int getLeave_rem() {
		return leave_rem;
	}
	public void setLeave_rem(int leave_rem) {
		this.leave_rem = leave_rem;
	}
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", basic=" + basic + ", leave_rem=" + leave_rem
				+ ", obj=" + obj + "]";
	}
	
	
}
