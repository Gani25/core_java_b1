package day23;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "Hello all welcome to SPRK Tech";
		System.out.println("My String is: " + str);

		System.out.println("Character at index 0: " + str.charAt(0));
		System.out.println("Character at index 10: " + str.charAt(10));

		System.out.println("Length of Str: " + str.length());
		System.out.println("Character at index last: " + str.charAt(str.length() - 1));

		String newStr = str.concat(". Learn Coding with US");

		System.out.println("My String: " + str);
		System.out.println("New String: " + newStr);

		System.out.println("String in upper case: " + str.toUpperCase());
		System.out.println("My String: " + str);

		String str1 = "Hello";
		String str2 = "Hellsprk";
		System.out.println("COmparing str1 and str2 = " + str1.compareTo(str2));
		str1 = "heLlo";
		str2 = "heLLo";
		System.out.println("COmparing str1 and str2 = " + str1.compareTo(str2));

		str1 = "hello";
		str2 = "hello";
		System.out.println("COmparing str1 and str2 = " + str1.compareTo(str2));

		str1 = "HELLO";
		str2 = "hello";
		System.out.println("COmparing str1 and str2 ignoring case= " + str1.compareToIgnoreCase(str2));

		str1 = "Hello"; // 1000*
		str2 = "Hello"; // 1000*
		String str3 = new String("Hello"); // 2500*

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);

		System.out.println("Check content is same or not between 1 and 2? " + str1.equals(str2));
		System.out.println("Check content is same or not between 1 and 3? " + str1.equals(str3));
		str2 = "hello";
		System.out.println("Check content is same or not between 1 and 2 Ignore Case? " + str1.equalsIgnoreCase(str2));

		System.out.println("Check in my str it have hello or not? " + str.contains("hello"));
		System.out.println("Check in my str it have SPRK Tech or not? " + str.contains("SPRK Tech"));

		System.out.println(str.endsWith("Hello"));
		System.out.println(str.startsWith("Hello all"));
		System.out.println(str);
		System.out.println(str.indexOf("all"));
		System.out.println(str.indexOf("e"));
		System.out.println(str.lastIndexOf("e"));

		System.out.println(str.substring(str.indexOf("SPRK")));

		System.out.println(str.substring(10, 17));

		str1 = "   Abdul Gani Memon    ";
		System.out.println(str1);
		System.out.println(str1.length());

		System.out.println(str1.trim());
		System.out.println(str1.trim().length());

		str1 = "Banana,Mango,Apple";
		System.out.println(str1);

//		System.out.println(str1.replace(',', '-'));
		System.out.println(str1.replace(",", " - "));

		System.out.println(str1.replaceFirst(",", " -- "));

		str1 = "Banana, Mango, Orange, Guava, Litchi";

		String[] fruits = str1.split(", ");
		System.out.println(fruits);
		for (String fruit : fruits) {
			System.out.println("I like " + fruit);
		}

		String joinedStr = String.join(" - ", fruits);
		System.out.println(joinedStr);

	}
}
