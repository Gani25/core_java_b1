package day18;

public class ExceptionEx2 {

	public static void main(String[] args) {
//		String s = null;
		String s = "Abdul Gani";
		int[] arr = { 2, 4, 9 };
		try {
			System.out.println(s.length());

//			int res = 10/0;
			int res = 10 / 2;
			System.out.println(res);

//			System.out.println("Element at position 5 is " + arr[5]);

			String number = "5O";
			int num = Integer.parseInt(number);

			System.out.println("Number in integer is: "+num);
		} catch (NullPointerException np) {
			System.out.println(np.getMessage());
			np.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}

		System.out.println("Hello After Exception");

	}

}
