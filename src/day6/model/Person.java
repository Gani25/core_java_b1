package day6.model;

public class Person {
	
	// Default access modifier is default
	
	private int personId;
	
	private String name;
	
	private String gender;
	
	private int age;
	
	public Person(){
		System.out.println("Default Constructor of Person Class");
//		pId = 100;
//		name = "ABDUL";
//		age=30;
//		gender="MALE";
	}
	
	// Parameterized Constructor
	public Person(int personId, String name, String gender, int age){
		System.out.println("Parameterized Constructor of Person Class");
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
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
