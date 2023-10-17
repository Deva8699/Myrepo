package learn_Exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int no1=0;
		int no2=0;
		
		 
		try {
			no1 = sc.nextInt();
			 no2 = sc.nextInt();
		System.out.println(no1/no2);
		int[] ar = new int[5];
		ar[6]=67;
		}catch(ArithmeticException ae) {
			System.out.println("Check numbers");
		}catch(InputMismatchException ime) {
			System.out.println("Check input");
		}catch(ArrayofIndexOutOfBoundsExecption ai) {
			System.out.println("Check Index");
		}
		System.out.println(no1+no2);
		System.out.println(no1-no2);
		System.out.println(no1*no2);
		

	}

}
