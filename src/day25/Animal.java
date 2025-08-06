package day25;

public class Animal {
	private int age;
	private String name;

	public Animal(int age, String name) {
		// TODO Auto-generated constructor stub
		System.out.println("hello");
		this.age = age;
		this.name = name;
	}
	
	public Animal(Animal obj) {
		System.out.println("Copy COnstructor");
		name = obj.name;
		age = obj.age;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof Animal) {
			Animal animalObj = (Animal) obj;

			return animalObj.age == age && animalObj.name.equals(name);
		}
		return false;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}