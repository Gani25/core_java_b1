package day27.sets;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {

	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		
		students.add(new Student(1, "Abdul"));
		students.add(new Student(1, "Abdul"));
		students.add(new Student(1, "Aman"));
		students.add(new Student(2, "Abdul"));
		students.add(new Student(3, "Sara"));
		
		System.out.println(students);
		
	}

}
