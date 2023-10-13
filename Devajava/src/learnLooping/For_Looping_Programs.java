package learnLooping;

public class For_Looping_Programs {

	public static void main(String[] args) {
		
		For_Looping_Programs fl = new For_Looping_Programs();
		//fl.numberPattern1();
		//fl.Numbers();
		//fl.Numbers1();
	//fl.increaseNumber();
		//fl.DecreaseNumber();
	//	fl.Arrayloop();
	//	fl.AnotherArray();
		//fl.Continue_Statement_Program();
		//fl.Break_Statement_Program();
		//fl.numberPattern3();
		//fl.divisible_Infinity_Pattern();

	}
	private void numberPattern1() {                  // 1 1 1 1 1
		int no=5;
		
		for(int i=1;i<=5;i++)
		{
			System.out.print(1+ " ");
		}
		
	}
	
	private void Numbers()// 1 2 3 4 5
	{
		for (int i=1;i<=5;i++)

	System.out.print(i+ " ");
}
	}
	private void Numbers1()// 5 4 3 2 1 
	{
		for (int i=5;i>=1;i--)
{
	System.out.print(i+ " ");
}
	}
	
	private void increaseNumber()
	{                                                      //  1 2 3 4 5
		for( int row=1;row<=5;row++)            
			                                               //1 2 3 4 5
		{                                                  //1 2 3 4 5
		                                                   // 1 2 3 4 5
		for(int col=1;col<=5;col++)                         // 1 2 3 4 5
		{
			System.out.print(row+ " ");
		}
		System.out.println();
	}

}
	private void DecreaseNumber()                // 5 4 3 2 1
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
	public void Arrayloop( )
	{
		int[] marks= {88,79,100,34,95};
		int total=0;
		int count=0;
		for(int index=0;index<marks.length;index++) {
			total=total+marks[index];
			if(marks[index]<35) {
				count++;
			}
		System.out.println(total);
		System.out.println(total/marks.length);
		System.out.println(count);        // 1
		System.out.println(marks.length-count);     // 4
		}
	

if(count>0) {
	System.out.println("fail");
}else
{
	System.out.println("pass");
}
}
	
	public void AnotherArray()
	{
		int[] ar = new int[5];
		ar[0]=10;
		ar[2]=30;
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
	}
	
	private void Continue_Statement_Program() {    // 1 2 3 4 5 6 8 9 10 --->output
		  
		  for(int t=1;t<=10;t++) {
		   
		   if(t==7) {
		    continue;
		   }
		   
		   System.out.print(t+ " ");
}
	}
	
	private void Break_Statement_Program() {                   //  1 2 3 4 5 6 7 8 9 10 11 12 --->output
		  
		  for(int zo=1;zo<=20;zo++) {
		   System.out.print(zo+" ");
		   if(zo==12) {
		    break;
		   }
		  }
		  private void numberPattern3() {                   // 15 30 45 ----> output
			  
			  for(int no=1;no<=50;no++) {
			   if(no%3==0 && no%5==0) {
			    System.out.print(no+" ");
			   }
	}

		  private void divisible_Infinity_Pattern() {                //infinity times
		      int i = 1;int count=0;
		  for( ;true;i++) {
		   if(i%3==0 && i%5==0) {
		    System.out.print(i+" ");
		    count++;
		   }if(count==15) {
		    break;
		   }
	}
		  
		  }
		  }




