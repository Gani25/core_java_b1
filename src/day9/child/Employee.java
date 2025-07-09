package day9.child;

import day9.parent.Person;

public class Employee extends Person {

	private int empId;

	private double salary;

	public Employee() {
		System.out.println("Default constructor of Employee");
	}

	public Employee(String name, int age, String gender, int empId, double salary) {
		super(name, age, gender);
		System.out.println("Parameterized constructor of Employee");
		this.empId = empId;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [empId=" + empId + ", salary=" + salary + "]";
	}

	@Override
	public void deductTax() {

		System.out.println("15% tax from your salary is being deducted.");
		double deductedAmount = 0.15 * salary;
		System.out.println("Deducted Amount is: " + deductedAmount);
		salary = salary - deductedAmount;

	}

}
