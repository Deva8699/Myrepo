public class Rider 
{

public static void main(String[]args)
{
TrafficRules tr = new TrafficRules();
	int amt = tr.getFineamount();
	System.out.println(amt);
	
	
	tr.setFineamount(1500);
	amt = tr.getFineamount();
	System.out.println(amt);
	
}
}

