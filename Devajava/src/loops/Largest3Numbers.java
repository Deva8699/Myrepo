package loops;

import java.util.Scanner;

public class Largest3Numbers {
	public static void main(String[] args) {
		int a,b,c,largest;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter any Three Numbers:");
		a=S.nextInt();
		b=S.nextInt();
		c=S.nextInt();
		if(a>=b && a>=c) {
			System.out.println("largest number:"+a);
		}
		
		if(b>=a && b>=c) {
			System.out.println("largest number:"+b);
		}
		
		if(c>=a && c>=b) {
			System.out.println("largest number:"+c);
		}
		
	}

}
