package day24;

public class ThreadEx3 {

	public static void main(String[] args) {
		Counter counter = new Counter(); // 0

		Thread task1 = new Thread(() -> {
			for (int i = 1; i <= 100; i++) {
				counter.increment(); // 1 - 100
				System.out.println("Task1");
			}
		});

		Thread task2 = new Thread(() -> {
			for (int i = 1; i <= 100; i++) {
				counter.increment(); // 100 - 200
				System.out.println("Task2");
			}
			
		});
		
		task1.start();
		task2.start();
		try {
			task2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Value of counter is: "+counter.getCount());
	}
}
