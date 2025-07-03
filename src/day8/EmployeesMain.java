package day8;

import day8.parent.Employee;

public class EmployeesMain {
	
	public static void main(String[] args) {
//		Array of Objects
		
		Employee[] employees = {
				new Employee("Pranjal Khaire", 25, "Female", 35000, "IT"),
				new Employee("Ashutosh Verma", 30, "Male", 22500, "Admin"),
				new Employee("Pranjal Raibole", 20, "Female", 28000, "HR")
		};
		
		
		System.out.println("Employees Are: ");
		for(Employee theEmployee:employees) {
			theEmployee.deductTax();
			System.out.println(theEmployee);
		}
	}

}
