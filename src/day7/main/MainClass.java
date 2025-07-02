package day7.main;

import day7.Employee;

public class MainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Abdul Gani Memon");
		e1.setAge(50);
		e1.setGender("Male");
		e1.setSalary(25000);
		e1.setDepartment("IT");
		
		Employee e2 = new Employee("Rohan Gupta", 25, "Male", 12500, "Sales");
		
		System.out.println(e1);
		System.out.println(e2);
				
				
	}
}
