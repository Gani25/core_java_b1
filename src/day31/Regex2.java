package day31;

import java.util.regex.Pattern;

public class Regex2 {
	public static void main(String[] args) {
		// Only 5 characters
		System.out.println("Pattern.matches(\"^[a-zA-z]{5}$\", \"Abdul\") = "+Pattern.matches("^[a-zA-z]{5}$", "Abdul"));
		System.out.println("Pattern.matches(\"^[a-zA-z]{5}$\", \"Aman\") = "+Pattern.matches("^[a-zA-z]{5}$", "Aman"));
		
		// Validate pincodes
		System.out.println("Pattern.matches(\"^[0-9]{6}$\", \"410208\") = "+Pattern.matches("^[0-9]{6}$", "410208"));
		
		System.out.println("Pattern.matches(\"^[0-9]{3} [0-9]{3}$\", \"410208\") = "+Pattern.matches("^[0-9]{3} [0-9]{3}$", "410208"));
		System.out.println("Pattern.matches(\"^[0-9]{3}[0-9]{3}$\", \"410 208\") = "+Pattern.matches("^[0-9]{3} [0-9]{3}$", "410 208"));
		
		// Minimum 6 max infinite
		System.out.println("Pattern.matches(\"^[0-9A-Za-z@_]{6,}$\", \"pd@\") = "+Pattern.matches("^[0-9A-Za-z@_]{6,}$", "pd@"));
		System.out.println("Pattern.matches(\"^[0-9A-Za-z@_]{6,}$\", \"pd@1234\") = "+Pattern.matches("^[0-9A-Za-z@_]{6,}$", "pd@1234"));
		System.out.println("Pattern.matches(\"^[0-9 A-Za-z@_]{6,}$\", \"Memon @ Abdul\") = "+Pattern.matches("^[0-9 A-Za-z@_]{6,10}$", "Memon @ Abdul"));
		System.out.println("Pattern.matches(\"^[0-9 A-Za-z@_]{6,}$\", \"Memon @\") = "+Pattern.matches("^[0-9 A-Za-z@_]{6,10}$", "Memon @"));
		
		System.out.println("----------------------------------------------------");
		System.out.println("Java Regex Metacharacters");
		
		System.out.println( "Pattern.matches(\"^\\\\d+$\", \"1234\") = "+ Pattern.matches("^\\d+$", "1234"));
		System.out.println( "Pattern.matches(\"^\\\\d+$\", \"1O1\") = "+ Pattern.matches("^\\d+$", "1O1"));
		
		System.out.println(Pattern.matches("^[\\w $&@]{4,}$", "@ A$"));
		System.out.println(Pattern.matches("^[\\w\\W]{4,}$", "@ A$"));
	}

}
