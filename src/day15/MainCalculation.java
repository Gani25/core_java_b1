package day15;

import java.util.ArrayList;
import java.util.List;

public class MainCalculation {

	public static void main(String[] args) {
		// Lambda Expression
//		Calculation calculation = (a, b)->{
//			System.out.println("Addition of "+a+", "+b+" is "+(a+b));
//		};
		Calculation calculation = (a, b) -> System.out.println("Addition of " + a + ", " + b + " is " + (a + b));

		calculation.addition(5, 5);

		Util util = (a) -> {
			if (a <= 1)
				return false;

			for (int i = 2; i < a; i++) {
				if (a % i == 0)
					return false;

			}
			return true;

		};

		if(util.isPrime(12)) {
			System.out.println("Num is prime");
		}else {
			System.out.println("Num is not prime");
			
		}
		
		Util2 util2 = (a,b)-> (int)Math.pow(a, b);
		
		System.out.println(util2.power(5, 3));
	}
	
}
