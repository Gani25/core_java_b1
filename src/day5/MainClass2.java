package day5;

public class MainClass2 {
	
	public static void main(String[] args) {
		// Object of Person
		Person2 aman = new Person2();
		aman.firstName = "Aman";
		aman.lastName = "Gupta";
		aman.gender= "Male";
		aman.age = 35;
		
		Person2 abdul = new Person2();
		abdul.firstName = "Abdul Gani";
		abdul.lastName = "Memon";
		abdul.gender= "Male";
		abdul.age = 30;
		
		System.out.println( aman.showInfo());
		System.out.println( abdul.showInfo());
		
		
	}

}
