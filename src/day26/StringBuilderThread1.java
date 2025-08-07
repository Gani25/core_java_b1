package day26;

public class StringBuilderThread1 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		Thread task1 = new Thread(()->{
			sb.append(", Bye Bye Bye");
			sb.append(" SPRK TECH");
			System.out.println("String in = "+Thread.currentThread().getName() + ": "+sb);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sb.append(" Abdul");
			
			System.out.println("String in = "+Thread.currentThread().getName() + ": "+sb);
		});
		
		Thread task2 = new Thread(()->{
			sb.append(", Dear All");
			sb.append(", I like Java");
			System.out.println("String in = "+Thread.currentThread().getName() + ": "+sb);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sb.append(" Rohit Gupta");
			
			System.out.println("String in = "+Thread.currentThread().getName() + ": "+sb);
		});
		
		task1.setName("task-1");
		task2.setName("task-2");
		task1.start();
		task2.start();
	}

}
