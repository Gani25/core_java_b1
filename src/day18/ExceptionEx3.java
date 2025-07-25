package day18;

public class ExceptionEx3 {

	public static void main(String[] args) {

		String s = "Abdul Gani";

		try {
			for (int i = 0; i <= s.length(); i++) {
				System.out.println(s.charAt(i));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		} finally {
			System.out.println("Irespective of try or catch I will always run");
		}
	}

}
