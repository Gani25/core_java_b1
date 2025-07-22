package day16;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {
	
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(50);
		numbers.add(10);
		numbers.add(-5);
		numbers.add(25);
		numbers.add(-100);
		numbers.add(50);
		numbers.add(100);
		numbers.add(10);
		numbers.add(-5);
		numbers.add(25);
		System.out.println(numbers);
		
		System.out.println("Elements are: ");
		numbers.forEach((element)->System.out.println(element));
		Integer[] arr = numbers.toArray(new Integer[0]);
		
		System.out.println("Element at position 2: "+arr[2]);
		
		Set<String> foods = new HashSet<>();
		
		foods.addAll(Arrays.asList("Banana","Orange","Litchi","Apple","Watermelon"));
		
		System.out.println(foods);
		
		Set<String> foodsSorted = new TreeSet<>();
		
		foodsSorted.addAll(Arrays.asList("Banana","Orange","Litchi","Apple","Watermelon"));
		
		System.out.println(foodsSorted);
		
		String foodName = "Cherry";
		if(foodsSorted.contains(foodName)) {
			System.out.println("Already Exists");
		}else {
			
			System.out.println("Adding to Collection ");
			foodsSorted.add(foodName);
			System.out.println(foodsSorted);
		}
		
		List<String> foodsList = new LinkedList<>();
		
		foodsList.addAll(foodsSorted);
		System.out.println("List: "+foodsList);
		
		foodsList.sort(Collections.reverseOrder());
		System.out.println("List: "+foodsList);
	}

}
