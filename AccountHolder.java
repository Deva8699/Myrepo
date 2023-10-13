public class AccountHolder 
{
public static void main(String[]args)
{

Bank1 bb = new Bank1();
int min = bb.getMinimumBalance();
	System.out.println(min);
	
	bb.setMinimumBalance(300);
	min = bb.getMinimumBalance(); 
	System.out.println(min);

// System.out.println(bb.minimumBalance);
	
	// bb.minimumBalance=100;     //private
	//System.out.println(bb.minimumBalance); //private
	
	
	
}
}