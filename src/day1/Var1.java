package day1;

public class Var1 {
	
	public static void main(String[] args) {
		int age = 50; // 4byte
		System.out.println("The value of age is = "+age);
		
		double pi = 3.14;
		System.out.println("The value of double pi is = "+pi);
		
		System.out.println("The value of age is = "+age+"\n\nThe value of double pi is = "+pi);
		char alp = 'F';
		System.out.println("The value of char alp is = "+alp);
		
		String name = "SPRK TECH";
		System.out.println("String value is = "+name);
		
		boolean isActive = true;
		System.out.println("The value of boolean isAcitive is = "+isActive);
		
		// Literal -> F
		float fNum = 55.555F;
		System.out.println("The value of float fNum is = "+fNum);
		
		// short -> 2byte -> 16bits -> -32768 to 32767
		short sNum = 32767;
		
		// byte -2^7 to (2^7) - 1 -> -128 to 127
		byte bNum = 127;
		
		long lNum = 92_23_37_20_36_85_47_75_807L;
		
		System.out.println(lNum);
		
	}

}
