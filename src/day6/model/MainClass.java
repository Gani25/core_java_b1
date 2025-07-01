package day6.model;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Ashutosh Verma");
		p1.setGender("Male");
		p1.setAge(35);
		p1.setPersonId(10001);
		
		Person p2  =new Person(20, "Shubham Mhatre", "Male", 29);
		
//		System.out.println(p1.toString());
		System.out.println(p1);
		System.out.println(p2);
		
		
		System.out.println("Person 1 Name = "+p1.getName());
		System.out.println("Person 2 Name = "+p2.getName());

	}

}
