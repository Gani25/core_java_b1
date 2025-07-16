package day13;

public class BoxingUnBoxing {
	
	public static void main(String[] args) {
		int x = 55;
		Integer y = x; // Autoboxing
		
		Integer num = Integer.valueOf(x); // Manual Boxing
		
		Integer newNum = new Integer(55); // Manual Boxing
		
		System.out.println(y);
		System.out.println(y.toString());
		System.out.println(y.intValue());
		
		System.out.println(num == newNum);
		System.out.println(num.equals(newNum));
	}

}
