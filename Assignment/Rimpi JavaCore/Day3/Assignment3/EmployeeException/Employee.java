package Assignment3.EmployeeException;


public abstract class Employee {
	int EmpId;
	String EmpName;
	double BasicPay;
	int NoofLeave;
	Address obj;

	abstract void calculateSalary();

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getBasicPay() {
		return BasicPay;
	}

	public void setBasicPay(double basicPay) {
		BasicPay = basicPay;
	}

	public int getNoofLeave() {
		return NoofLeave;
	}

	public void setNoofLeave(int noofLeave) {
		NoofLeave = noofLeave;
	}

	public Address getObj() {
		return obj;
	}

	public void setObj(Address obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", BasicPay=" + BasicPay + ", NoofLeave="
				+ NoofLeave + ", obj=" + obj + ", getObj()=" + getObj() + "]";
	}

	
	
	

}
