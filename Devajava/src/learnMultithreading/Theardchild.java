package learnMultithreading;

public class Theardchild extends Thread{

	
	public void run()
	{
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=5;i++) {
			System.out.println("Thread-Child"+i);
		}
	}
}
