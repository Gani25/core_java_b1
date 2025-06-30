package day3;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		int i = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		if(n >=2) {
			System.out.println("Series of Prime Number from 1 to "+n);
		}
		while (i <= n) {
			boolean isPrime = true;
			int j = 2;
			while (j <= i / 2) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
				j++;
			}

			if (isPrime) {
				System.out.print(i + " ");
			}
			i++;

		}
	}
}
// WAP to print series of prime number from 1 to n

//WAP to check whether the number is armstrong or not
// 153 -> 1^3 + 5^3 + 3^3 = 153

// WAP to print series of ARMSTRONG number from 1 to N
// N = 2000


