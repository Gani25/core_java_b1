package day16;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Vector;

public class DequeEx1 {
	
	public static void main(String[] args) {
		Deque<Integer> numbers = new ArrayDeque<>();
		
		numbers.offer(50);
		numbers.offer(9);
		numbers.offer(32);
		System.out.println(numbers);
		numbers.offerFirst(6);
		System.out.println(numbers);
		
	}

}
