public class Geeks4
{
	//Constructor with one argument
 public Geeks4(String name)
 {
	 System.out.println(name);
 }
	//Constructor with two argument
  public Geeks4(String name,int age)
  {
	  System.out.println(name);
	  System.out.println(age);
  }
	//Constructor with one argument but with different type
  public Geeks4(long id)
  {
	  System.out.println(id);
  }
	
	public static void main(String[]args)
	{
		Geeks4 geek2 = new Geeks4("Deva");
		Geeks4 geek3 = new Geeks4("Muthu",12);
		Geeks4 geek4 = new Geeks4(123456789);
	}
}
