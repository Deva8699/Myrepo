package learnLooping;

public class LoopingDemo {

	public static void main(String[] args) {
		LoopingDemo ld  = new  LoopingDemo();
		//ld.day1();
		//ld.day2();
		//ld.day3();
		//ld.day4();
		//ld.day5();
		//ld.Nested_Looping();
		ld.Nested_Looping1();
		

	}
	
	private void day1()
	{
		int count =1;
		while(count<=5)
		{
			System.out.print(5+ " ");
			count =count+1;
		}
	}
		
		private void day2()
		{
			int no = 5;
			while(no>=1)
			{
				System.out.print(no+ " ");
				no =no-1;
			}
		System.out.println(no);
	}
		private void day3()
		{
			int no =1;
			while(no<=100)
			{
				if(no%3==0) {
					System.out.print(no+ "  ");
				}
				no++;
			}
		}
		
		private void day4()
		{
			int row=1;
			while(row<=5)
			{
			int col=1;
			while(col<=5)
			{
				System.out.print(col+" ");
				col++;
			}
			System.out.println();
			row++;
		}
		}
		
		private void day5()
		{
			int col=1;
			while(col<=5)
			{
				System.out.print(col+" ");
				col++;
			}
		}
		
		public void Nested_Looping()
		{
			
				int col=5;
				while(col>=1) {
					System.out.print(col+ " ");
					col--;
				}
			}
		
		public void Nested_Looping1()
		{
			    int row=0;
			    while(row<5) {
      			int col=5;
				while(col>=1) {
					System.out.print(col+ " ");
					col--;
				}
				System.out.println();
				row++;
			}
		}
}




	


