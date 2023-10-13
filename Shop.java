public class Shop
{
  
	String name;
	int price;

public static void main(String[] args)
{
    
	Shop product1=new Shop();
	   product1.name="Deva";
	   product1.price=30;
	
	Shop product2=new Shop();
	   product2.name="Raja";
	   product2.price=80;
	
	Shop product3=new Shop();
	    product3.name="king";
	    product3.price=400;
	
	System.out.println(product1.name);
	System.out.println(product2.name);
	System.out.println(product3.price);


     product1.buy();
	 product1.sell();

}
public void display(){
	 
}
	public void buy()
	{
		System.out.println("Buying products");
	}
	public void sell()
	{
		System.out.println("selling products");
	}



}