package day8;

import day8.parent.Employee;

public class PartEmployee extends Employee {
	
	private double dailyWages;
	private int numOfDays;
	
	public PartEmployee() {
		System.out.println("Default Constructor of PartEmployee Class");
	}
	
	public PartEmployee(String name, int age, String gender, String department, double dailyWages, int numOfDays) {
		super(name, age, gender, dailyWages*numOfDays, department);
		
		System.out.println("Parameterized cosntructor of PartEmployee Class");
		this.dailyWages =dailyWages;
		this.numOfDays = numOfDays;
	}

	public double getDailyWages() {
		return dailyWages;
	}

	public void setDailyWages(double dailyWages) {
		this.dailyWages = dailyWages;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}	

	@Override
	public void deductTax() {
		System.out.println("No Tax Deduction For Part Employee");
	}

	@Override
	public String toString() {
		return super.toString()+"PartEmployee [dailyWages=" + dailyWages + ", numOfDays=" + numOfDays + "]";
	}

	

	
}
