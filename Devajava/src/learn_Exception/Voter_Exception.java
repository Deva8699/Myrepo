package learn_Exception;

public class Voter_Exception extends Exception{
	
	public void vote(int age) throws Voter_Exception {
		if(age<18) {
			Voter_Exception ve = new Voter_Exception();
			throw ve;
		}else {
			System.out.println("Cast your vote");
		}
	
		
		
		
	}
}



