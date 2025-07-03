package day8.parent;

public class Person {
	
	// Default access modifier is default
	
	protected String name;
	
	protected String gender;
	
	protected int age;
	
	public Person(){
		System.out.println("Default Constructor of Person Class");
		
	}
	
	// Parameterized Constructor
	public Person( String name, String gender, int age){
		System.out.println("Parameterized Constructor of Person Class");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
