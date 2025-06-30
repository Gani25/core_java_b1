package day5;

import java.util.Scanner;

public class Person2 {

	// FIELDS
	String firstName;
	String lastName;
	int age;
	String gender;

	// Methods
	String showInfo() {
		return "----Person Info----" + "\nFirst name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age
				+ "\nGender: " + gender;

	}

	void acceptInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		firstName = sc.nextLine();
		System.out.println("Enter last name: ");
		lastName = sc.nextLine();
		System.out.println("Enter gender: ");
		gender = sc.next();
		System.out.println("Enter age: ");
		age = sc.nextInt();

	}
}
