public class SuperMarket
{
       String ItemName1= "Horlicks";
	   int price1 =230;
	 
	  String ItemName2= "Boost";
	  int price2 =350;
	
	 String ItemName3= "viva";
	int price3 =400;
	
	public static void main(String args[])
	{
		SuperMarket object1=new SuperMarket();
		
		System.out.println(object1.ItemName1);
		
		System.out.println(object1.price1);
		
		SuperMarket object2=new SuperMarket();
		
		System.out.println(object2.ItemName2);
		
		System.out.println(object2.price2);
	
		SuperMarket object3=new SuperMarket();
		
		System.out.println(object3.ItemName3);
		
		System.out.println(object3.price3);
		
	}
}
		