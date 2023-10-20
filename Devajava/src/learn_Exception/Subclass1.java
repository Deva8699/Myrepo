package learn_Exception;

public class Subclass1 {

	public static void main(String[] args) {
		
		
		Voter_Exception re = new Voter_Exception();
		try {
			re.vote(19);
		} catch (Voter_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
