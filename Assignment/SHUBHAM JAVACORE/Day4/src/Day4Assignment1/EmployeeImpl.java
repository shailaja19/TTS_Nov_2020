package Day4Assignment1;

import java.util.LinkedList;
import java.util.List;

public class EmployeeImpl implements EmployeeInt {
	public List<Employee> m1=new LinkedList<Employee>();


	@Override
	public void addEmployee(Employee e) throws DuplicateEmployeeID {
		// TODO Auto-generated method stub
//		if(m1.contains(e1)) {
//			System.out.println("The object is found");
//		}
//	else {
//		System.out.println("The object is not found");
//	}
//		
		
		
	}

	@Override
	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object readEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double yearSalary(Employee e) {
		// TODO Auto-generated method stub
		return e.EmpSalary * 12.00;
	}

	@Override
	public double appSalary(Employee e) {
		if(e.EmpSalary<10000.00) {
			return ((e.EmpSalary + 5000.00) * 12.00);
		}
		else
			return (e.EmpSalary * 12.00);
	}

}
