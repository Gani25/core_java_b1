package day9.parent;

public abstract class Person {

	protected String name;
	protected int age;
	protected String gender;
	
	// declaration of method without body -> abstract method
	public abstract void deductTax();

	public Person() {
		System.out.println("Default constructor of Person Class");
	}

	public Person(String name, int age, String gender) {
		System.out.println("Parameterized constructor of Person Class");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void displayInfo()
	{
		System.out.println("Name is = "+name+ ", Age = "+age);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	

}
