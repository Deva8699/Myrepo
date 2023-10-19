package learn_Exception;

public class CheckException {
	public static void main(String[] args) {
		
		CheckException ce = new  CheckException();
		ce.throwsDemo(100,20);
	}

	void throwsDemo(int no1, int no2)throws ArithmeticException
	{
		System.out.println(no1/no2);
		
	}
	
	

}
