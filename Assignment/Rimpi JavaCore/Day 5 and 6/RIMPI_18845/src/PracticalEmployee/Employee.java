package PracticalEmployee;

      // Abstract Employee class having attributes Employee Id, Employee Name, Basic pay, address as a object
public abstract class Employee {
	
	public String EmpName;
	public double BasicPay;
	//object of address
	public Address obj;
	public int EmpId;
	
	//abstract class calculateSalary to be overridden
	public abstract void calculateSalary();

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



	public Address getObj() {
		return obj;
	}

	public void setObj(Address obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", BasicPay=" + BasicPay + ", obj=" + obj + "]";
	}

}