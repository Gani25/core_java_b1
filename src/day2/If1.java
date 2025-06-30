package day2;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WAP to check whether the number is even or odd
		int num;
		
		System.out.println("Enter a numebr: ");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Number = "+num + " is even");
			System.out.printf("Number = %d is even\n",num);
		}else {
			System.out.println("Number = "+num + " is odd");
		}
	}

}
