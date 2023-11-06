package programs;

public class Day3 {

	


	


	public static void main(String[] args) {
		
		Day3 dd = new Day3();
		//dd.sum_of_n_numbers();
		//dd.Mul_of_fa_numbers();
		//dd.D_given_numbers();
		//dd.D_given_numbers_G();
		//dd.D_given_numbers_S();
		dd.D_given_numbers_S_G();     //find smallest and greatest in single loop
		
	}

	

	private void D_given_numbers_S_G() {
		
		
		int div=2;
		int no=100;
		int first=0;
		int last=0;
		boolean stop=false;
		while(div<no)
		{
			if(no%div==0) {
				last=div;
				if(stop==false) {
					first=div;
					stop=true;
				}
			}
			div++;
		}
		System.out.println(first);
		System.out.println(last);
		
		
		
		
	}



	private void D_given_numbers_S() {  // smallest divisor of value
		int no=100;
		int div=2;
		int small=0;
		while(div<no)
		{
			if(no%div==0)
			{
				small=div;
				break;
			}
			div++;
		}
		System.out.println(small);
		
		
	}



	private void D_given_numbers_G() {   // greatest divisor of value
		
		int  no=20;
		int div=1;
		int great=0;
		while(div<no)
		{
			if(no%div==0)
			{
				great=div;
			}
			div++;
		}
		System.out.println(great);
		
	}



	private void D_given_numbers() { // Divisors of given value
		
		int div =1;
		int no=10;
		while(div<=no)
		{
			if(no%div==0)
			{
				System.out.println(div);
			}
			div++;
		}
		
		
		
	}



	private void Mul_of_fa_numbers() {    // lly of factorial numbers
		
		int no=1;
		int box=1;
		while(no<=10)
		{
			System.out.println(no);
			box=box*no;
			no++;
		}
		System.out.println(box);
		
	}


	private void sum_of_n_numbers() {
		int box=0;
		int no=1;
		while(no<=10)
		{
			System.out.println(no);
			box=box+no;
			no++;
		}
		System.out.println(box);
		
	}

}
