package learn_Exception;

public class SubClass {

	public static void main(String[] args) {
		
		CheckException cd = new  CheckException();
		try {
		cd.throwsDemo(10, 0);
		}catch(ArithmeticException ex) {
			System.out.println("Check demo");
		}
	}

}
