package programs1;

public class Day4 {

	public static void main(String[] args) {
		
		Day4 dd = new Day4();
		dd.div();
		

	}

	private void div() {
		int no=18;
		int div=2;
		while(div<=no/2)
		{
			if(no%div==0)
				System.out.println(div);
			div++;
		}
		
	}

}
