package day26;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Hello");
		System.out.println(builder);
		builder.append(" I am learning spring boot");
		System.out.println(builder);
		
		builder.delete(5, 12);
		System.out.println(builder);
		builder.deleteCharAt(builder.length()-1);
		System.out.println(builder);
		builder.insert(5, " I am l");
		System.out.println(builder);
		builder.insert(builder.length(), 't');
		System.out.println(builder);
		
	}

}
