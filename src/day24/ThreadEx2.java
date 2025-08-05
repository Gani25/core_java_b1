package day24;

public class ThreadEx2 {

//	Join

	public static void main(String[] args) {
		System.out.println("Beginning Of Main and Outside Task");
		// Print first 10 numbers with a delay of 1000ms -> 1s
		Thread task1 = new Thread(() -> {

			System.out.println("1 to 10 numebrs are: ");
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value of number is: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		// Print first 10 alphabet with a delay of 1500ms -> 1.5s
		Thread task2 = new Thread(() -> {

			System.out.println("1 to 10 characters are: ");
			char alp = 'A';
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value of character is: " + alp);
				alp++;
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		task1.start();
		try {
			task1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		task2.start();
		try {
			task2.join(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("In Main and Outside Task");
	}

}
