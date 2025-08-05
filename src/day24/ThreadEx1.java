package day24;

public class ThreadEx1 {
	
	public static void main(String[] args) {
		RunnableImpl runnableImpl = new RunnableImpl();
		
		Thread thread = new Thread(runnableImpl);
		thread.start();
		
		ThreadImpl impl2 = new ThreadImpl();
		impl2.start();
	}

}
