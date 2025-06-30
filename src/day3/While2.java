package day3;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		int i = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		// boolean isPrime = true; // asume any num is a prime number

		// Change value of isPrime if number is negative or one
		boolean isPrime = (n > 1) ? true: false;
		while (i <= n / 2) {

			if (n % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}

		if (isPrime) {
			System.out.println("Number " + n + " is a prime number");
		} else {
			System.out.println("Number " + n + " is NOT a prime number");

		}
	}
}
// WAP to print series of prime number from 1 to n
