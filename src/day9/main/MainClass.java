package day9.main;

import day9.child.Employee;
import day9.parent.Person;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Person p1 = new Person(); ERROR Bcoz Person is Abstract Class
		
		Employee e1 = new Employee("Abdul Memon", 25, "Male", 1001, 25000);
		e1.deductTax();
		System.out.println(e1);
		
		// Hiding The Impl Detail
		// Dynamic Method Dispatch: Reference of Base Class and Object of Derived Class
		
		Person e2 = new Employee("Roshan Pandey", 30, "Male", 1002, 80000);
		e2.deductTax();
		System.out.println(e2);
		e2.displayInfo();
	}
}
