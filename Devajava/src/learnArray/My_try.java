package learnArray;


public class My_try {

	public static void main(String[] args) {
		
		My_try Mt = new My_try();
		//Mt.array2();
		//Mt.array3();
		//Mt.array4();
		Mt.array5();
		
		
		
		
	}
	public void array5(){
	{
		int[][] marks= {{10,20,30},
		               {40,50,60},
		               {70,80,90}};
		int index=2;
		for(int row=0;row<marks.length;row++)
		{
			for(int col=0;col<marks[row].length;col++)
			{
				if(col==index)
				System.out.print(marks[row][col]+" ");
			}
			System.out.println();
			index--;
			
		}
	}
	
	}

	public void array4() {
		int[][] marks= {{80,70,78},
		        {77,72,89},
		        {45,74,86}};
		//System.out.println(marks[0][0]);
		//System.out.println(marks[1][1]);
		//System.out.println(marks[2][2]);
		for(int row=0;row<marks.length;row++)
		{
			for(int col=0;col<marks[row].length;col++)
			{
				if(row==col) {
				System.out.println(marks[row][col]);
			}
			System.out.println() ;
			
			}
		}
		
	}
	public void array3() {
		
		int[][] marks= {{80,70,78},
				        {77,72,89},
				        {45,74,86}};
		for(int row=0;row<marks.length;row++)
		{
			for(int col=0;col<marks[row].length;col++)
			{
				System.out.println(marks[row][col]);
			}
		}
		
		System.out.println(marks.length);
		System.out.println(marks[0].length);
		
	}
		public void array2() {
			
		int[][] ar= {{ 80,70,78,74,56},
				    {70,80,96,57,36},
				    {56,67,89,66,54}};
	   
       System.out.println(ar.length);
       System.out.println(ar[0].length);
       
       for(int row=0;row<ar.length;row++) {
    		   System.out.println();
    	   
       for(int col=0;col<ar[row].length;col++) {
    	   if(ar[row][col]>=90) {
    		   System.out.println(ar+ "[row][column]");
    	   }

    	   
    	   System.out.println(ar[row][col]);
       }

	}
		}
}







