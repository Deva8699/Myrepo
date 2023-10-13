public class Calculator1
{

public static void main(String[]args)
{
    Calculator1 casio = new Calculator1();
    int c = casio.add();
	System.out.println("total is "+c);
	casio.subtract(c);
	
	//System.out.println("Total is : "+c);
}
	
	
	public int add()
	{
		int tamil = 90, eng = 80;
		int total = tamil+eng;
//		System.out.println("Total is "+total);
		return total; 
	}
	public void subtract(int input)
	{
		System.out.println("input is"+input);
		input = input -10;
		System.out.println("now input is "+input);
	}
}

		
		
		
		
		
	