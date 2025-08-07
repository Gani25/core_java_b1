package day26;

import java.util.ArrayList;
import java.util.Comparator;
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
//	Comparator<Student> comparator = (s1,s2)->{
//		if(s1.getDepartment().equals(s2.getDepartment())) {
//			// If dept same then with percentage
//			
//			return Integer.compare(s2.getPercentage(),s1.getPercentage());
//		}else {
//			// If dept not same then go with dept
//			return s1.getDepartment().compareTo(s2.getDepartment());
//			
//		}
//	};
//	students.sort(comparator);
	students.sort((s1,s2)-> (s1.getDepartment().equals(s2.getDepartment()))? Integer.compare(s2.getPercentage(),s1.getPercentage()): s1.getDepartment().compareTo(s2.getDepartment()) );
	
	System.out.println("Students are after sorting with rollno \n");
	students.forEach((theStudent)->System.out.println(theStudent));
	
}
}
