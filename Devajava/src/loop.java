import java.util.Scanner;

public class odd_even{

	public static void main(String[] args) {
		int no;
		Scanner S =new Scanner(System.in);
		System.out.println("Enter any Number:");
		no=S.nextInt();
		if(no%2==0)
		{
			System.out.println("Even Number");
		}
		else{
			System.out.println("odd Number");
			
		}

	}

}
