package day11.main;

import java.util.Arrays;

import day11.final_demo.Animal;
import day11.final_demo.Dog;
import day11.final_demo.Kangaroo;

public class MainClass {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.walk();
//		dog.numOfLegs = 4;
//		dog.setNumOfLegs(4);
//		dog.walk();

		Kangaroo kangaroo = new Kangaroo();
		kangaroo.walk();
		
		Animal.SAY_HELLO();
		Dog.SAY_HELLO();
		
		
	}
}
