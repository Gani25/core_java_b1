package day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 10, 2, 6, 9, 50, 1);

		System.out.println(numbers);

		// create array with only odd numbers
		List<Integer> oddNums = new ArrayList<>();
		for (int element : numbers) {
			if (element % 2 != 0) {
				oddNums.add(element);
			}
		}

		System.out.println("Odd numbers List is: " + oddNums);

		// Same question solve with stream
		List<Integer> oddNumbers = numbers.stream().filter((element) -> element % 2 != 0).toList();
		System.out.println("Odd numbers with stream List is: " + oddNumbers);
		
		// Create new List with square of element
		List<Integer> squareList = numbers.stream().map((element)-> element * element).toList();
		
		System.out.println(squareList);
		
		// Square of only even element
		List<Integer> squareListEven = numbers.stream()
				.filter((element)-> element %2 == 0)
				.map((element)-> element * element)
				.collect(Collectors.toList());
		
		System.out.println(squareListEven);
	}
}
