package day18;

import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {
		
		int n1,n2,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		n1=sc.nextInt();
		System.out.println("Enter number 2: ");
		n2=sc.nextInt();
		
		res = n1/n2;
		
		System.out.println("Division of "+n1+", "+n2 +" is " + res);
		
	}

}
