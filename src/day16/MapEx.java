package day16;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	
	public static void main(String[] args) {
		Map<String, String> userInfo = new HashMap<>();
		userInfo.put("root", "1234");
		System.out.println(userInfo);
		userInfo.put("abdul", "123456");
		System.out.println(userInfo);
		userInfo.put("root", "12root");
		System.out.println(userInfo);
		userInfo.putIfAbsent("abdul", "8888");
		System.out.println(userInfo);
		System.out.println("---- For EACH ----");
		userInfo.forEach((userName, password)->{
			System.out.println(userName+" : "+password);
		});

		System.out.println(userInfo.keySet());
		
	}
	
	

}
