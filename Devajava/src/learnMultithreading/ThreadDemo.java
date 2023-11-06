package learnMultithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Theardchild tc = new Theardchild();
		System.out.println(tc.getState());
		tc.start();
		tc.setName("Devaraj");
		
		System.out.println(tc.getId());
		System.out.println(tc.getName());
		tc.setPriority(10);
		System.out.println(tc.getPriority());
		System.out.println(tc.isAlive());
		System.out.println(tc.isDaemon());
		
		Theardchild tc1 = new Theardchild();
		System.out.println(tc1.getState());
		tc1.start();
		
		
		
		for(int i=1;i<=5;i++) {
			System.out.println("Thread-Demo"+i);
		}

	}

}
