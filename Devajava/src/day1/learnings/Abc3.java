package day1.learnings;

public class Abc3 {
	public static void main(String[] args) {
		float person1=5.2f,person2=5.4f,person3=6.2f;
		if(person1>person3)    //true
		{
		if(person3>person1)
		{
			System.out.println("Person1");
		}
		else if (person3>person1)
		{
			System.out.println("Person3");
		}
		else
		{
			System.out.println("Person3,Person1");
		}
		}
		else if(person2>person1)
		{
			if(person2>person3)
			{
				System.out.println("Person2");
			}
			else if(person3>person2)
			{
				System.out.println("Person3");
			}
			else
			{
				System.out.println("Person3,Person2");
			}
			
		}
		else if(person1>person3)
		{
			System.out.println("Person1");
		}
		else if(person3>person1)
		{
			System.out.println("Person3");
		}
		else
		{
			System.out.println("Person1,Person3");
		}
		
		
	}

}
