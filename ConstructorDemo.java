public class ConstructorDemo
{
	public ConstructorDemo( String s)
	{
		
	System.out.println("Hi i am one args constructor");
	System.out.println(s);
	}
	public ConstructorDemo()
	{
		System.out.println("Hi i am 0 args constructor");
	}
	public ConstructorDemo(float fl)
	{
		System.out.println("Hi i am 1 args constructor");
		System.out.println(fl);
	}
	public ConstructorDemo(float fl, boolean b)
	{
		System.out.println("Hi i am 2 args constructor");
		System.out.println(fl);
		System.out.println(b);
	}
	
	
		
	
	public static void main(String[]args)
	{
		ConstructorDemo cd = new ConstructorDemo("abc");
		ConstructorDemo cd2 = new ConstructorDemo();
		ConstructorDemo cd3 = new ConstructorDemo(54.5f);
		ConstructorDemo cd4 = new ConstructorDemo(54.5f,true);
	}
}