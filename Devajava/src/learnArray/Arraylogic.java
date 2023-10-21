
package learnArray;

public class Arraylogic {

	public static void main(String[] args) {
		Arraylogic AL = new Arraylogic();
		AL.first_letter_repeated();

	}

	private void first_letter_repeated() {
		
		
		char [] name = { 'A' , 'N','A', 'N','D' ,'A'};
		
		char ch = name[0];
		for(int i=1;i<name.length; i++)
		{
			
			if(ch==name[i]) {
				 System.out.println("first letter repeated is ==>"+ch);
			}
				
		}
	}

}
