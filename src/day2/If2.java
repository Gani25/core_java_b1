package day2;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {

		// WAP to check whether the character is vowel or consonant
		char alp;
		
		System.out.println("Enter a character: ");
		
		Scanner sc = new Scanner(System.in);
		alp = sc.next().charAt(0);
		
		if(alp == 'a' ||alp == 'e' ||alp == 'i' ||alp == 'o' ||alp == 'u' )
		{
			System.out.println("Character = "+alp + " is vowel");
		}else {
			System.out.println("Character = "+alp + " is consonant");
		}
	}
}

/*
 * WAP to check whether the year is leap or not
 * */
