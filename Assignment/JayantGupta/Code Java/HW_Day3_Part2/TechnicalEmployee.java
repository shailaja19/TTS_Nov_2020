package HW_Day3_Part2;

public class TechnicalEmployee extends Employee {
	String skill;
	public void calculateSalary() {
		System.out.println(basicpay+(0.12*basicpay));
	}
	
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "TechnicalEmployee [skill=" + skill + ", empId=" + empId + ", empName=" + empName + ", basicpay="
				+ basicpay + ", leaves=" + leaves + ", obj=" + obj + ", getSkill()=" + getSkill() + "]";
	}

}
