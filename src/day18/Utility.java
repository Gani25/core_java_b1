package day18;

public class Utility {
	
	public void checkAge(int age) throws InvalidAgeException {
		if(age <=0 || age >= 125) {
			throw new InvalidAgeException("Age cannot be less than 0 or more than 125");
		}
		System.out.println("Correct age and your age is: "+age);
	}

}
