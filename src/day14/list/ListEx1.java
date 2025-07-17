package day14.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author SPRK TECHNOLOGIES
 * @throw
 * */
public class ListEx1 {
	public static void main(String[] args) {
		List<String> foods =  new ArrayList<>();
		
		System.out.println("My Foods = "+foods);
		System.out.println("Length of my list is: "+foods.size());
		foods.add("Apple");
		foods.add("Banana");
		foods.add("Apple");
		foods.add("Pizza");
		foods.add("Pav Bhaji");
		foods.add("Apple");
		System.out.println("My Foods = "+foods);
		System.out.println("Length of my list is: "+foods.size());
		System.out.println("Food at index 3 = "+foods.get(3));
		System.out.println("My Foods = "+foods);
		
		foods.add(0, "Pani Puri");
		System.out.println("My Foods = "+foods);
		
		foods.addFirst("Sev Puri");
		// foods.add("Stawberry");
		foods.addLast("Stawberry");
		System.out.println("My Foods = "+foods);
		
		List<String> myFavFoods = new ArrayList<>();
		myFavFoods.add("Pasta");
		myFavFoods.add("Orange");
		myFavFoods.add("Litchi");
		
		System.out.println("My Fav Foods = "+myFavFoods);
		
		foods.addAll(myFavFoods);
		System.out.println("My Foods = "+foods);
		foods.addAll(1,myFavFoods);
		System.out.println("My Foods = "+foods);
		
		System.out.println("First Occurence Index of apple = "+foods.indexOf("Apple"));
		System.out.println("Last Occurence Index of apple = "+foods.lastIndexOf("Apple"));
		
		System.out.println(foods.isEmpty());
		System.out.println("Element deleted at index 2 = "+foods.remove(2));
		System.out.println("My Foods = "+foods);
		System.out.println("Element deleted at index 2 = "+foods.remove("Apple"));
		System.out.println("My Foods = "+foods);
		foods.add("Orange");
		System.out.println("My Foods = "+foods);
		foods.removeAll(myFavFoods);
		System.out.println("My Foods = "+foods);
		
		System.out.println(foods.set(2, "Watermellon"));
		System.out.println("My Foods = "+foods);
		// foods.sort(null);// ASC
		// DESC
		foods.sort(Collections.reverseOrder());
		System.out.println("My Foods After Sorting= "+foods);
		
		List<String> reverseFoods = foods.reversed();
		System.out.println("My Foods After Reversed = "+reverseFoods);
		
		System.out.println(foods.indexOf("Shubham"));
		System.out.println(foods.contains("Shubham"));
		System.out.println(foods.contains("Apple"));
		
		
		
		
		

		
		
		
		
	}

}
