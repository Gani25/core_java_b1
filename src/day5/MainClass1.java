package day5;

public class MainClass1 {
	
	public static void main(String[] args) {
		// Object of Person
		Person aman = new Person();
		aman.firstName = "Aman";
		aman.lastName = "Gupta";
		aman.gender= "Male";
		aman.age = 35;
		
		Person abdul = new Person();
		abdul.firstName = "Abdul Gani";
		abdul.lastName = "Memon";
		abdul.gender= "Male";
		abdul.age = 30;
		
		System.out.println("Person Info");
		System.out.println("First Name = "+aman.firstName);
		System.out.println("Last Name = "+aman.lastName);
		System.out.println("Gender = "+aman.gender);
		System.out.println("Age = "+aman.age);
		
		System.out.println("Person Info");
		System.out.println("First Name = "+abdul.firstName);
		System.out.println("Last Name = "+abdul.lastName);
		System.out.println("Gender = "+abdul.gender);
		System.out.println("Age = "+abdul.age);
	}

}
