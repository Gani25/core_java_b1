package day12.child;

import day12.LandAnimal;
import day12.WaterAnimal;

public class Turtle implements LandAnimal, WaterAnimal {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Tutle is walking");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Tutle is eating");
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Tutle is swiming");
		
	}

}
