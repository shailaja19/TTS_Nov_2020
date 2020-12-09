package Day4Assignment1;

public interface EmployeeInt {
	public void addEmployee(Employee e) throws DuplicateEmployeeID;
	public void deleteEmployee(Employee e);
	public  Object readEmployee();
	public double yearSalary(Employee e1);
	 public double appSalary(Employee e1);

}
