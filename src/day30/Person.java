package day30;

public class Person {
	
	private static Person person;
	
	private String name;
	
	private int age;
	
	private Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static Person getPerson(String name, int age) {
		if(person == null) {
			System.out.println("Returning New Object");
			person =  new Person(name, age);
			return person;
		}else {
			System.out.println("Already Object existed");
			return person;
		}
	}
}
