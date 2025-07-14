package day11.main;

import day11.main.Entity.Address;

//Aggregation-> object is given to another class
public class AggregationMain {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setEmpId(1001);
		employee.setSalary(250000);
		employee.setName("Rohini Jadhav");
		
		Address address = new Address();
		address.setBuildingName("Glomax");
		address.setCity("Navi Mumbai");
		address.setState("Maharashtra");
		
		employee.setAddress(address);
		
		System.out.println(employee.getAddress());
		
		System.out.println("State = "+employee.getAddress().getState());
		System.out.println(employee);
	}

}
