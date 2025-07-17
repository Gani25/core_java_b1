package day14.list;

import java.util.ArrayList;
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
		
		
		
		
	}

}
