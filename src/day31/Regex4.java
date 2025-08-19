package day31;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex4 {
//	Phone Number patter
	public static void main(String[] args) {
		String number;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter phone number in standard format: ");
		number = sc.nextLine();
		
		/*
		 * 1. + -> followed by country code {1, 3}
		 * 2. space -> optional
		 * 3. User can give 10 digits
		 * 4. User can give 5 digit space then 5 digits
		 * 5. UAE 4digit 4 digit -> UAE
		 * 6. US 3digit 3digit 4digit
		 * */
		
		String regex = "^(\\+{1}\\d{1,3})([ ]?\\d){8,13}$";
		
		if(Pattern.matches(regex, number)) {
			System.out.println("Phone number have a correct format..");
			System.out.println("Phone Number is "+number);
		}else {
			System.out.println("Enter correct format of phone number!!!");
			System.out.println("You enter: "+number);
			
			// Password pattern -> min 8 length atleast one uppercase and one special characters
		}
		
	}

}
