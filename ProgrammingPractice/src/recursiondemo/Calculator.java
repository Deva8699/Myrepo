package recursiondemo;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.find_sum(12345);
		
        

	}

	private void find_sum(int no) {
		int sum=0;
		while(no>0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		if(sum<10)
		{
			System.out.println(sum);
		}
		else {
			find_sum(sum);
		}
			
		}
		
	}


