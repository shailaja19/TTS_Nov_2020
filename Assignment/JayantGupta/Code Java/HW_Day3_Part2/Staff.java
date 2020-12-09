package HW_Day3_Part2;

public class Staff extends Employee {
	String title;
	public void calculateSalary() {
		System.out.println(basicpay+(0.18*basicpay));
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Staff [title=" + title + ", empId=" + empId + ", empName=" + empName + ", basicpay=" + basicpay
				+ ", leaves=" + leaves + ", obj=" + obj + "]";
	}

	
}
