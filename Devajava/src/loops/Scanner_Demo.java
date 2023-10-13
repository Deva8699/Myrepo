package loops;

import java.util.Scanner;

public class Scanner_Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
	int no=sc.nextInt();	
	
		for(int row=1;row<=no;row++) {
		for(int col=1;col<=row;col++) {
			System.out.print("* ");
}//for(int col=0;col<no;col++) {
//			System.out.print(" ");
//		}
		System.out.println();
		}
sc.close();


Scanner_Demo sd=new Scanner_Demo();
	}

}
