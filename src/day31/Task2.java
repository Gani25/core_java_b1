package day31;

import java.util.ArrayList;
import java.util.List;

// Reverse Each word in String
public class Task2 {
	
	public static void reverse(StringBuilder builder) {
		int i = 0;
		int j = builder.length()-1;
		
		while(i < j) {
			char temp = builder.charAt(i);
			builder.setCharAt(i, builder.charAt(j));
			builder.setCharAt(j, temp);
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		String str = "my name is abdul";
		// reverse each word
		// ym eman si ludba
		
		System.out.println("Normal String: "+str);
		String[] strArray = str.split(" ");

		List<String> reverseArr = new ArrayList<>();
		for(String element: strArray) {
			StringBuilder sb = new StringBuilder(element);
//			System.out.println(sb);
			reverse(sb);
			reverseArr.add(sb.toString());
//			System.out.println(sb);
		}
//		System.out.println(reverseArr);
		String[] revStrArray = reverseArr.toArray(size -> new String[size]);
//		String[] revStrArray = reverseArr.toArray(String[]::new);
		
		String revString = String.join(" ", revStrArray);
		
		System.out.println("Reverse Words In String is: "+revString);
		
	}

}
