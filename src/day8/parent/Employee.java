package day8.parent;

public class Employee extends Person {

	private double salary;
	private String department;
	
	public Employee() {
		
		// super();// calling base class consturctor
		
		System.out.println("Default Constructor of Employee Class");
		
	}
	
	public Employee(String name, int age, String gender,double salary,String department) {
		// calling base class parameterized constructor from derived class constructor
		super(name,gender,age); 
		System.out.println("Parameterized Constructor of Employee Class");
	
		this.salary=salary;
		this.department=department;
	}

	public void deductTax() {
		if(salary > 25000)
		{
			salary = salary - (0.1 * salary);
			System.out.println("10% Tax Deducted\nUpdated Salary = "+salary);
		}
		else {
			System.out.println("As your salary is below.\nNo Tax Deducted");
		}
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
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