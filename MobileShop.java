package Computer;

public class MobileShop
{
	int disc; 
	int price;     //same class in 2 constructor and 2 objects
	public MobileShop(int price,int disc)
	{
		
		System.out.println(price-disc); //two argument pass
	}
	
	public MobileShop()     // constructor call pannanum 
	{
		this(8000,400);
		System.out.println("Welcome");
	}
	
	public static void main(String[]args)
	{
		MobileShop mobile1= new MobileShop();
		MobileShop mobile2= new MobileShop(10000,500);
	}
}
