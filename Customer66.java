public class Customer66
{
public static void main(String[]args)
{
Hotel h = new Hotel();
int amt = h.getBillamount();
System.out.println(amt);
	
	h.setBillamount(150);
	amt = h.getBillamount();
	System.out.println(amt);
}
}