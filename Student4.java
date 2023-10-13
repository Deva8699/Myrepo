public class Student4
{
int id;
String Name;
	public Student4(int i,String n)
	{
		id=i;
		Name=n;
	}

	
public static void main(String[]args)
{
	Student4 s1 = new Student4(111,"Deva");
	Student4 s2 = new Student4(222,"Raj");
	
	
	s1.display();
	s2.display();
}
	void display()
	{
		System.out.println(id);
		System.out.println(Name);
	}
	
	
}

	
	