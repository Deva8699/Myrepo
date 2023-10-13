package loops;

public class Alphabets {

	public static void main(String[] args) {
		Alphabets Al = new  Alphabets();
	//	Al.printstarinsameline();
		//Al.printstar_in_difflines();
	//	Al.print_8_x_stars();
		Al.print_spl_symbol();
		Al.print_H();
	

	}
	public void print_spl_symbol() {
		for(int row=1;row<=9;row++)
		{
		for(int col=1;col<=9;col++) {
			if(row==1 || col==5)
			{
				System.out.print("*  ");
			}
			//else if(col==5) {
				//System.out.print("*  ");
			//}
			else {
			System.out.print("  ");
	}
		}
		 System.out.println();		
	}
		}
	public void print_8_x_stars() {
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<=5;col++) {
			System.out.print("* ");
		}
		System.out.println();
			
		}
	}
	public void printstar_in_difflines() {
		for(int col=1;col<=7;col++)
		{
			System.out.println("* ");
		}
		System.out.println();
	}
		
	
	public void printstarinsameline() {
		for(int col=1;col<=7;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}

}
