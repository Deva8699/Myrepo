package learnArray;

public class Array_demo {

	public static void main(String[] args) {
		
		Array_demo ad =  new Array_demo();
		ad.learning_1();
		

	}
private void learning_1() {
		
		int [] marks = { 98 ,98,100,88,100};
		
		int high=0;
	    int low=marks[0];
		
		
		for (int i = 0; i < marks.length; i++)
		{
			if(marks[i]>high)
			{
				high= marks[i];	
		}
			if(marks[i]<low)
			{
				low= marks[i];	
				
		}
		
		}
		System.out.println("Highest_Mark : "+high);
		System.out.println("Lowest_Mark : "+low);
			
		}

}
