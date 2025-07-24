package day17;

import java.util.ArrayList;
import java.util.List;

public class PascalLeetCode118 {

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> pascal = new ArrayList<>();
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		pascal.add(firstRow);

		// Assume middle element is 0
		int middleElement = 0;
		// Start from 2nd row and goes till numRows-1

		for (int i = 1; i < numRows; i++) {
			List<Integer> currentRow = new ArrayList<>();
			// add first element i.e 1 in current row
			currentRow.add(1);

			// Create middle element start from 1 and
			// goes till middleElement
			for (int j = 1; j <= middleElement; j++) {
				int currentElement = pascal.get(i-1).get(j);
				int prevElement = pascal.get(i-1).get(j-1);
				int element = currentElement+prevElement;
				currentRow.add(element);
			}

			// add last element i.e 1 in current row
			currentRow.add(1);
			middleElement++; // 1
			pascal.add(currentRow);
		}

		return pascal;
	}

	public static void main(String[] args) {
		
		PascalLeetCode118 obj = new PascalLeetCode118();
		
		List<List<Integer>> numbers = obj.generate(5);
		System.out.println(numbers);

	}

}
