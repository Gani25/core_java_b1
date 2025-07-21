package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LikedList2 {
	
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.add(50);
		numbers.add(250);
		numbers.add(315);
		numbers.push(85);
		numbers.offer(90);
		
		System.out.println(numbers);
		System.out.println("This element will be deleted next: "+numbers.peek());
		System.out.println(numbers);
		System.out.println("Deleted Element is: "+numbers.poll());
		System.out.println("Deleted Element is: "+numbers.pop());
		
		System.out.println(numbers);
		
	}

}
