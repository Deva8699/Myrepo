package loops;

import java.util.Scanner;

public class SumofTwoNum {

	public static void main(String[] args) {
		int a,b,c=0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter any two numbers:");
        a=S.nextInt();
      //  System.out.println("Enter Second numbers");
        b=S.nextInt();
        c=a+b;
        System.out.println("Sum:"+c);
	}

}
