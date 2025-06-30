package day2;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {

		String userName = "Admin";
		String password = "1234";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user name: ");
		String uName = sc.next();
		System.out.println("Enter password: ");
		String pw = sc.next();
		
		if(uName.equals(userName)) {
			if(pw.equals(password))
			{
				System.out.println("Login Successfully");
				
			}else {
				System.out.println("Incorrect Password");
			}
		}else {
			System.out.println("Incorrect username");
		}
	}
}

