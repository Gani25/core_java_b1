package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx3 {
	
	public static void main(String[] args) {
		List<String> favFood = new ArrayList<>();
		
		favFood.add("Vada Pav");
		favFood.add("Bhaji");
		favFood.add("Frooti");
		favFood.add("Pizza");
		favFood.add("Burger");
		
		System.out.println(favFood);
		
		favFood.removeIf((element)->element.length()==5);
		System.out.println(favFood);
		
		favFood.forEach((element)->System.out.println(element));
		
		String[] foods =  favFood.toArray(new String[0]);
		
		System.out.println(foods);
		for(String food : foods) {
			System.out.println(food);
		}
	}

}
