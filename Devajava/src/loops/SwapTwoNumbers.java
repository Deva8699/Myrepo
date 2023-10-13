package loops;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a,b,c;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter value in a:");
		a=S.nextInt();
		System.out.println("Enter value in b:");
		b=S.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("value in a:"+a);
		System.out.println("value in b:"+b);
	}
	
}
