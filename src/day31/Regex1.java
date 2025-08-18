package day31;

import java.util.regex.Pattern;

public class Regex1 {
	
	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------");
		System.out.println("Java Regex Character classes");
		System.out.println("Check I have a or x or p character or not = "+Pattern.matches("^[apx]$", "a"));
		System.out.println("Check I have a or x or p character or not = "+Pattern.matches("^[apx]$", "aa"));
		System.out.println("Check I have a or x or p character or not = "+Pattern.matches("^[apx]$", "b"));
		System.out.println("Check I have a or x or p character or not = "+Pattern.matches("^[apx]$", "x"));
		System.out.println("Check I have A to Z or a to z character or not = "+Pattern.matches("^[a-zA-Z]$", "x"));
		System.out.println("Check I have A to Z or a to z character or not = "+Pattern.matches("^[a-zA-Z]$", "ABDUL"));
		System.out.println("Check I have 0 to 9 character or not = "+Pattern.matches("^[0-9]$", "5"));
		System.out.println("---------------------------------------------");
		System.out.println("Java Regex Quantifiers");
		System.out.println("Pattern.matches(\"^a+$\", \"a\") = "+Pattern.matches("^a+$", "a"));
		System.out.println("Pattern.matches(\"^[a-z]+$\", \"abdul\") = "+Pattern.matches("^[a-z]+$", "abdul"));
		System.out.println("Pattern.matches(\"^[a-z]+$\", \"Abdul\") = "+Pattern.matches("^[a-z]+$", "Abdul"));
		System.out.println("Pattern.matches(\"^[a-zA-Z]+$\", \"Abdul\") = "+Pattern.matches("^[a-zA-Z]+$", "Abdul"));
		System.out.println("Pattern.matches(\"^[a-zA-Z]+$\", \"500\") = "+Pattern.matches("^[a-zA-Z]+$", "500"));
		System.out.println("Pattern.matches(\"^[a-zA-Z0-9]+$\", \"500\") = "+Pattern.matches("^[a-zA-Z0-9]+$", "500"));
		System.out.println("---------------------------------------------");
	}

}
