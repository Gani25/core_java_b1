package day3;
import java.util.Scanner;
public class While1 {	
	public static void main(String[] args) {
		int i = 1;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		// n = 10
		// i =1
		while(i<=n)
		{
			System.out.println(i++);
		}
	}
}
// WAP to print series of prime number from 1 to n
