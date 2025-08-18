package day31;

import java.util.Map;
import java.util.TreeMap;

//count number of each character in a string
public class Task1 {

	public static void main(String[] args) {
		String str = "banana";
		
		Map<Character, Integer> occurenceMap = new TreeMap<>();
		
		for(char alp: str.toCharArray()) {
			occurenceMap.put(alp, occurenceMap.getOrDefault(alp, 0)+1);
			
		}
//		for(int i = 0; i<str.length();i++)
//		{
//			char alp = str.charAt(i);
//		occurenceMap.put(alp, occurenceMap.getOrDefault(alp, 0)+1);
//		}
		
//		System.out.println(occurenceMap);
		occurenceMap.forEach((k,v)->{
			System.out.println(k + " = " + v);
		});
	}
}
