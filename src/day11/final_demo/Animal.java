package day11.final_demo;

//public final class Animal {
public class Animal {

	protected final int NUM_OF_LEGS = 4;

	public Animal() {
//		numOfLegs = 4;
	}

	public final void walk() {
		System.out.println("Animal is Walking with "+NUM_OF_LEGS+" legs");
	}

	public int getNumOfLegs() {
		return NUM_OF_LEGS;
	}
	
	public final static void SAY_HELLO() {
		System.out.println("Hello from animal");
	}

//	public void setNumOfLegs(int numOfLegs) {
//		this.numOfLegs = numOfLegs;
//	}
	
	

}
