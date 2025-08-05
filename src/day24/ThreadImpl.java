package day24;

public class ThreadImpl extends Thread {
	
	@Override
	public void run() {
		System.out.println("Natural number from 1 to 20 in reverse order");
		
		for(int i = 20; i>=1;i--)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Reverse Order is: "+i);
			
			if(i == 18)
			{
				// Destroy Thread
				Thread currThread = Thread.currentThread();
				currThread.stop();
			}
		}
	}

}
