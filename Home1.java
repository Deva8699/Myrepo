public class Home1
{
	static String name = "Deva";
	static int doorno=40; 
	
	
	
	String name1;
	int age1;
    float weight;
	boolean students;
	char lastname;
	public static void main(String[]args)
	{
		System.out.println(Home1.name);
		System.out.println(Home1.doorno);
		
		Home1 person1 = new Home1();
		System.out.println("doorNo=>"+Home1.doorno);
		System.out.println("person1.name1 => "+person1.name1);
		System.out.println("person1.age1 "+person1.age1);
		System.out.println("person1.weight "+person1.weight);
		System.out.println(person1.students);
		System.out.println(person1.lastname);
		Home1 person2=new Home1();
		System.out.println(person2.name1);
		System.out.println(person2.age1);
		
		Home1 person3=new Home1();
		System.out.println(person3.name1);
		System.out.println(person3.age1);
		
		
		
		
		
		
		
		
		
	}
	
	
}