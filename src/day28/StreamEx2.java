package day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {

	public static void main(String[] args) {
		List<Integer> marks= Arrays.asList(10, 80, 32, 45, 29, 50, 88,15,22);

		System.out.println(marks);
		
		// Print failed students marks
		System.out.println("Failed Students Marks is\n"+marks.stream().filter((e) -> e<35).toList());
		// count numbers of failed students 
		System.out.println("Number of failed students is\n"+marks.stream().filter((e) -> e<35).count());
		
		// Give grace marks of 10 to failed students
		System.out.println("Failed Students Marks After 10 Graceis\n"+marks.stream().filter((e) -> e<35).map(element -> element+10).toList());
		// Give grace marks of 10 to failed students and check how many failed
		System.out.println("Failed Students Marks After Giving 10 Grace is\n"+marks.stream().filter((e) -> e<35).map(element -> element+10).filter(e-> e<35).toList());
		
		// SOrt marks in descending order
		System.out.println(marks.stream().sorted(Collections.reverseOrder()).toList());
		
		// Sort String based on length
		List<String> fruits = Arrays.asList("Litchi","Banana","Mango","Orange","Watermellon","Pomegranate","Kiwi", "Demo");
		
		System.out.println(fruits);
		Comparator<String> c = (fruit1, fruit2)->{
			int f1Length = fruit1.length();
			int f2Length = fruit2.length();
			
			
			return f1Length == f2Length? fruit1.compareTo(fruit2):Integer.compare(f1Length, f2Length);
		};
		
		List<String> sortedFruits = fruits.stream().sorted(c).toList();
		System.out.println(sortedFruits);
		
		
		System.out.println(fruits.stream().max(c).get());
		System.out.println(fruits.stream().min(c).get());
		System.out.println(fruits.stream().min(c).toString());


//		fruits.forEach(e-> System.out.println(e));
		fruits.forEach(System.out::println);
		
		System.out.println(marks);
		// convert marks to Integer array
		
		Integer[] arr = marks.stream().toArray(Integer[]::new);
		
		System.out.println(arr);
		for(Integer e: arr) {
			System.out.println(e);
		}
		
	}
}
