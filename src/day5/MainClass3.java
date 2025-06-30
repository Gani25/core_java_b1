package day5;

import java.util.Scanner;

public class MainClass3 {
	
	public static void main(String[] args) {
		// Object of Person
		Scanner sc =new Scanner(System.in);
		Person2 aman = new Person2();
		System.out.println("Enter first name: ");
		aman.firstName = sc.nextLine();
		
		System.out.println("Enter last name: ");
		aman.lastName = sc.nextLine();
		System.out.println("Enter gender: ");
		aman.gender = sc.next();
		System.out.println("Enter age: ");
		aman.age = sc.nextInt();
		
		// Dummy Next Line
		sc.nextLine();
		Person2 abdul = new Person2();
		System.out.println("Enter first name: ");
		abdul.firstName = sc.nextLine();
		
		System.out.println("Enter last name: ");
		abdul.lastName = sc.nextLine();
		System.out.println("Enter gender: ");
		abdul.gender = sc.next();
		System.out.println("Enter age: ");
		abdul.age = sc.nextInt();
		
		
		System.out.println( aman.showInfo());
		System.out.println( abdul.showInfo());
		
		
	}

}
