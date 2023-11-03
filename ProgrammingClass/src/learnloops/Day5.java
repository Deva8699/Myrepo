package learnloops;

public class Day5 {

	public static void main(String[] args) {
		
		Day5 dd = new Day5();
		//dd.divi();
		//dd.divi1();
		//dd.divi2();
		dd.divi3();      //prime and not prime
		
		

	}

	private void divi3() {
		int no=9;
		int div=2;
		int count=0;
		while(div<=no/2) {
			if(no%div==0)
			{
				count++;
				System.out.println("not prime");
				break;
				
			}
			div++;
		}
		if(count==0)
		{
			System.out.println("prime");
		}
		
		
		
	}

	private void divi2() {
		int no=19;
		int div=2;
		int count=0;
		while(div<=no/2) {
			if(no%div==0)
			{
				System.out.println(div);
				count ++;
			}
			div++;
		}
		System.out.println(count);
		if(count==0)
			System.out.println("prime");
		else {
			System.out.println("not prime");
		}
		
	}

	private void divi1() {
		
			int no=18;
			int div=2;
			int  count=0;
			while(div<=no/2)
			{
				if(no%div==0) {
					
				System.out.println(div);
				count++;
				}
				
				div++;
			}
			System.out.println(count);
			
		
	}

	private void divi() {
		int no=19;
		int div=2;
		while(div<=no/2)
		{
			if(no%div==0)
			System.out.println();
			div++;
		}
		System.out.println(div);
		
	}
	

}
