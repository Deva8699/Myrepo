package loops;

public class PatternsProgramming {

	public static void main(String[] args) {
		PatternsProgramming PP = new PatternsProgramming();
		//PP.Patterns1();
		//PP.Patterns2();
		// PP.Patterns3();
		  //PP.Patterns4();
		   //PP.Patterns5();
		  // PP.Patterns6();
		 // PP.Patterns7();
		 // PP.Patterns8();
		 // PP.Patterns9();
		 // PP.Patterns10();
		 // PP.Patterns11();
		  // PP.Patterns12();
		 //   PP.Patterns13();
		   // PP.Patterns14();
		   // PP.Patterns15();
		     // PP.Patterns16();
		     // PP.StarPattern();
		    //  PP.heart();
		      PP.D();
	}
	
	public void D()
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++) {
				if(row==1 || row==5 || col==1 || col==5)
				{
				if(row==1 && col==5 || row==5  && col==5) {
					
					System.out.print("* ");
				}
				
				else 
					System.out.print( "*");
				}
				
				
				else 
					System.out.print(" ");
				}
				System.out.println();
			
		}
	}
	
	private  void heart() {
		for(int row=1; row<=5; row++)
			{
				for(int col=1; col<=5; col++)
				{
					if(col==2 && row==1 || col==4 && row==1 || row==2 && col==1 || col==3 && row==2 ||col==5 && row==2|| row==3 && col==1 || col==5 && row==3 || row==4 && col==2 || row==4 && col==4 || col==3 && row==5)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
			}
				System.out.println();
			}
		}
	public void StarPattern()
	{
		
		for(int i=1;i<=5;i++) {
		for(int j=4;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1);k++) {
			System.out.print("*");
		}
		System.out.println("");
		}
	}
	
	public void Patterns16()          // 5 4 3 2 1 
	{
		for(int i=5;i>=1;i--) 
			
		System.out.print(i+" ");
	}
	
	
	private void Patterns15()
	{                                                      //  1 2 3 4 5
		for( int row=1;row<=5;row++)                       //1 2 3 4 5
		{                                                  //1 2 3 4 5
		                                                   // 1 2 3 4 5
		for(int col=1;col<=5;col++)                         // 1 2 3 4 5
		{
			System.out.print(col+ " ");
		}
		System.out.println();
	}

}
	private void Patterns14()                    // 5 4 3 2 1
	{                                             // 5 4 3 2 1
		for( int row=1;row<=5;row++)               // 5 4 3 2 1
		{                                          // 5 4 3 2 1
		for(int col=5;col>=1;col--)                 // 5 4 3 2 1
		{
			System.out.print(col+ " ");
		}
		System.out.println();
		}
	
}
	
	private void Patterns13()
	{                                                      //  1 1 1 1 1
		for( int row=1;row<=5;row++)                       //  2 2 2 2 2
		{                                                  //  3 3 3 3 3	                                                   // 
		for(int col=1;col<=5;col++)                         // 4 4 4 4 4
		{                                                   // 5 5 5 5 5
			System.out.print(row+ " ");
		}
		System.out.println();
	}
	}
	
	public void Patterns12()         // 1 2 3 4 5
	{
		for(int i=1;i<=5;i++)
		System.out.print(i+" ");
	}
	
	public void Patterns11() {             // 15 
		int num=15;                        // 14 13 
		for(int row=1;row<=5;row++)        // 12 11 10
		{                                  // 9  8   7  6 
	     for(int col=1;col<=row;col++) {   // 5 4  3 2 1 
	    	 System.out.print(num+" ");
	    	 num --;
	     }
	     System.out.println();
		}
	}
	public void Patterns10()                  // 1 0 1 0 1
	{                                         // 1 0 1 0
		for(int row=5;row>1;row--) {          // 1 0 1
		for(int col=1;col<=row;col++) {       // 1 0 
			if(col%2!=0)                      // 1
			{
				System.out.print(1+" ");
			}
			else {
				System.out.print(0+" ");
			}
			System.out.println();
		}
		}
	}
	public void Patterns9()                
	{                                      
		for(int row=5;row>=1;row--) {      
		for(int col=row;col>=5;col++)	   
		{                             
			System.out.print(row +" "); 
		}
		System.out.println();
		}
	}
	public void Patterns8()                // 5
	{                                      // 4 4
		for(int row=5;row>=1;row--) {      // 3 3 3
		for(int col=5;col>=row;col--)	   // 2 2 2 2
		{                                  // 1 1 1 1 1
			System.out.print(row+" "); 
		}
		System.out.println();
		}
	}
	public void Patterns7()               // 1
	{                                     // 2 2
		for(int row=1;row<=5;row++) {     // 3 3 3
		for(int col=1;col<=row;col++)	  // 4 4 4 4
		{                                 // 5 5 5 5 5
			System.out.print(row+" ");
		}
		System.out.println();
		}
	}
	public void Patterns6() {                //
		int end=1;
		for(int row=1;row<=5;row++) {
		for(int col=row;col<=end;col++)	{
			System.out.print(end);
			end++2;
		}
		System.out.println();
		}
	}
	public void Patterns5() {             // 1 
		int no=1;                         // 2 3
		for(int row=1;row<=5;row++) {     // 4 5 6
		for(int col=1;col<=row;col++){    // 7 8  9  10
			System.out.print(no+" ");     //11 12 13 14 15
			no++;
		}
		System.out.println();
		}
	}
	public void Patterns4(){                 // 5
		for(int row=5;row>=1;row--) {        // 5 4
		for(int col=5;col>=row;col--) {      // 5 4 3
			System.out.print(col+" ");       // 5 4 3 2
		}                                    // 5 4 3 2 1
		System.out.println();
			
		}
	}
	public void Patterns3() {              // 1
		for(int row=1;row<=5;row++) {      // 1 2
		for(int col=1;col<=row;col++)      // 1 2 3
		{                                  // 1 2 3 4 
			System.out.print(col+" ");     // 1 2 3 4 5
		}
		System.out.println();
	}
	}
	
	
	public void Patterns2() {              // 5 4 3 2 1
		for(int row=5;row>=1;row--) {      // 5 4 3 2 
		for(int col=5;col>=6-row;col--) {  // 5 4 3 
			System.out.print(col+" ");     // 5 4 
		}                                  // 5
		System.out.println();
		}
	}
	
	public void Patterns1() {                   // 1 2 3 4 5
		for(int row=5;row>=1;row--)             // 1 2 3 4
		{                                       // 1 2 3
		for(int col=1;col<=row;col++)           // 1 2
		{                                       // 1
			System.out.print(col+" ");
		}
		System.out.println();
	}

	}
}

