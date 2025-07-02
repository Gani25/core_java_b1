package day7;

import day7.parent.Person;

public class Employee extends Person {

	private int salary;
	private String department;
	
	public Employee() {
		
		// super();// calling base class consturctor
		
		System.out.println("Default Constructor of Employee Class");
		
	}
	
	public Employee(String name, int age, String gender,int salary,String department) {
		// calling base class parameterized constructor from derived class constructor
		super(name,gender,age); 
		System.out.println("Parameterized Constructor of Employee Class");
	
		this.salary=salary;
		this.department=department;
	}

	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [salary=" + salary + ", department=" + department + "]";
	}

	
	
}