package day27;

public class MainClass {
	
	public static void main(String[] args) {
		Dog dog = new Dog() {
			
			public String color;
			public String species;
			
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String getSpecies() {
				return species;
			}
			public void setSpecies(String species) {
				this.species = species;
			}
			


			@Override
			public void walk() {
				// TODO Auto-generated method stub
				System.out.println("Dog is walking");
				System.out.println("Color of dog is "+color+"\nSpecies is "+ species);
			}

			@Override
			public void bark() {
				// TODO Auto-generated method stub
				System.out.println("Dog is barking");
				System.out.println("Color of dog is "+color+"\nSpecies is "+ species);
				
			}
			
		};
		dog.setColor("Purple");
		dog.setSpecies("Husky");
		dog.bark();
		dog.walk();
	}

}
