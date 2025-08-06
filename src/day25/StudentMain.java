package day25;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
public static void main(String[] args) {
	List<Student> students = new ArrayList<>();
	
	students.add(new Student(10, "Shubham", "Mech", 89));
	students.add(new Student(5, "Shlok", "IT", 98));
	students.add(new Student(2, "Abdul", "Mech", 35));
	students.add(new Student(1, "Nandini", "IT", 92));
	students.add(new Student(6, "Rohan", "IT", 38));
	students.add(new Student(3, "Aman", "Mech", 68));
	
	System.out.println("Students are before sorting with rollno \n");
	students.forEach((theStudent)->System.out.println(theStudent));
	
	// null means asc
	students.sort(null);
	System.out.println("Students are after sorting with rollno \n");
	students.forEach((theStudent)->System.out.println(theStudent));
	
}
}
