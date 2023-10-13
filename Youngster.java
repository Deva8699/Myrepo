package Tirunelveli;
public class Youngster extends Parent
{
    public static void main(String[]args)
	{
		Youngster yy = new Youngster();
		//yy.study();
		yy.gardering();
		//yy.fixmarriage();
		yy.takeRest();
		System.out.println(yy.age);
		System.out.println(yy.savings);
		//Parent pp = new Parent();
		//pp.fixmarriage();

	}
	public void fixmarriage()
	{
	super.fixmarriage();
	//this.study();
	Youngster.study();
	System.out.println("Youngster-opinion");
	}
	
	 public void study()
	 {
		 System.out.println("studying");
	
	
	
	}
}
