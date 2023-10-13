public class StudentClass
{

	String name;
	int age;
	
	public static void main(String[]args)
	{
		
		StudentClass s1=new StudentClass();
			s1.name="Deva";
			s1.age=78;
		
		StudentClass s2=new StudentClass();
			s2.name="Raja";
			s2.age=89;
		
		StudentClass s3=new StudentClass();
			s3.name="King";
			s3.age=85;
		
		StudentClass s4=new StudentClass();
			s4.name="Lion";
			s4.age=45;
		
		StudentClass s5=new StudentClass();
			s5.name="kangaroo";
			s5.age=98;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		
		System.out.println(s3.name);
		System.out.println(s3.age);
		
		System.out.println(s4.name);
		System.out.println(s4.age);
		
		System.out.println(s5.name);
		System.out.println(s5.age);
		
		

		s1.sports();
		s1.sportsactive();
	}
public void sports()
{
	System.out.println("Programming class");
}
	
	public void sportsactive()
	{
		 System.out.println("Testactive class");
	}
	
}
	
	













