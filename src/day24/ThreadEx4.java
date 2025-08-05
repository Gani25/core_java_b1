package day24;

public class ThreadEx4 {

	public static void main(String[] args) {
		Counter2 counter = new Counter2(); // 0

		Thread task1 = new Thread(() -> {
			for (int i = 1; i <= 100; i++) {
				counter.increment(); // 1 - 100
			}
			System.out.println("Task1 -> Value of Counter is: "+counter.getCount());
		});

		Thread task2 = new Thread(() -> {
			for (int i = 1; i <= 100; i++) {
				counter.increment(); // 100 - 200
			}
			System.out.println("Task2 -> Value of Counter is: "+counter.getCount());
			
		});
		
		task1.start();
		
		task2.start();

		
		System.out.println("Value of counter is: "+counter.getCount());
	}
}
