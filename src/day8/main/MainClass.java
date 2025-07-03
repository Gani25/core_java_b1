package day8.main;

import day8.PartEmployee;
import day8.parent.Employee;

public class MainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Abdul Gani Memon");
		e1.setAge(50);
		e1.setGender("Male");
		e1.setSalary(50000);
		e1.setDepartment("IT");
		
		e1.deductTax();
		
		Employee e2 = new Employee("Rohan Gupta", 25, "Male", 12500, "Sales");
		e2.deductTax();
		System.out.println(e1);
		System.out.println(e2);
		
		PartEmployee pte1 = new PartEmployee("Ashutosh Verma", 35, "Male", "HR", 3000, 20);
		pte1.deductTax();
		System.out.println(pte1);
				
				
	}
}
