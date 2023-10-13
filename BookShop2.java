public class BookShop2
{
	String name;
	int price;
	int pages;
	public BookShop2(String s, int a,int b)
	{
		System.out.println("Are you constructor? print yes");
		
		name= s;
		price= a;
		pages= b;
	}
    public static void main(String[]args)
{
     BookShop2 book1 = new BookShop2("abc",40,200);
	 BookShop2 book2 = new BookShop2("bcd",50,250);
		
		book1.display();
		book2.display();
	}
	public void display()
	{
		
		System.out.println(name);
		System.out.println(price);
		System.out.println(pages);
	}
}