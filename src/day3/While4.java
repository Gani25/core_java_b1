package day3;

import java.util.Scanner;

public class While4 {

	public static boolean checkPrime(int num) {
		int i;
		for (i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void printSeriesOfPrime(int num) {
		int i;
		if (num > 1) {
			System.out.println("Series of prime number from 1 to " + num);
		}else {
			System.out.println("Please enter positive integer greater than 1");
		}
		for (i = 2; i <= num; i++) {
			// we will call checkPrime if returns true we will print that i
			if (checkPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		printSeriesOfPrime(n);

	}
}
