package day25;

public class Main {
public static void main(String[] args) {
	Animal obj1 = new Animal(16, "Black");
	Animal obj2 = new Animal(16, "Black");
	Animal obj3 = obj1;
	System.out.println(obj1 == obj2);
	
	System.out.println(obj1.equals(obj2));
	System.out.println(obj1.equals(obj3));
	System.out.println(obj1);
	System.out.println(obj3);
	
	obj3.setName("Brown");
	System.out.println("After changing color");
	System.out.println(obj1);
	System.out.println(obj3);
	
	// Copy Constructor
	
	Animal obj4 = new Animal(obj2);
	System.out.println("Obj 2 = "+obj2);
	System.out.println("Obj 4 = "+obj4);
	
	obj2.setAge(40);
	obj2.setName("Orange");

	System.out.println("Change obj 2");
	System.out.println("Obj 2 = "+obj2);
	System.out.println("Obj 4 = "+obj4);
}
}
