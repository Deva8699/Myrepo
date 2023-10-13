package loops;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		int no=0,rev=0,r,a;
		Scanner S= new Scanner(System.in);
		System.out.println("Enter any no");
	     no=S.nextInt();
	     a=no;
		while(no>0) {
			r=no%10;
			rev = rev*10+r;
			no=no/10;
		}
		System.out.println("Reverse:"+rev);

	}

}
