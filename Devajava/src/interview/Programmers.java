package interview;
import.java.util.Scanner;

public class Programmers {

	public static void main (String[] args)
	{
	
Programmers Pg = new Programmers(); 
       // Pg.SumTwoNumbers();
        Pg.SwapTwoNumbers();
	}
	public void SwapTwoNumbers()
	{
		int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Value in a :");
        a = s.nextInt();
        System.out.println("Enter Value in b :");
        b = s.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("Values in a:" + a);
        System.out.println("Values in b:" + b);
	}
}

	
	public void SumTwoNumbers(){
		int a = 10, b = 20, c = 0;
        c = a + b;
        System.out.println("Sum: " + c);
	}

}

