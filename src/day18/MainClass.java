package day18;

public class MainClass {

	public static void main(String[] args) {
		Utility utility = new Utility();

		try {
			utility.checkAge(-20);
		} catch (InvalidAgeException e) {
			
			System.err.println(e.getMessage());
		}

	}

}
