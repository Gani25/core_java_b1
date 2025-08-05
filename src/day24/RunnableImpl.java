package day24;

public class RunnableImpl implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Printing First 20 natural numbers");

		for(int i = 1; i<=20;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Natural Number is: "+i);
			
		}
	}

}
