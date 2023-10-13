package learnArray;

public class Arraydemo {

	public static void main(String[] args) {
		Arraydemo AD = new  Arraydemo();
		//AD.whileloop();	
		//AD.forloop();
		//AD.properties();
		AD.totalArray();
		
		
	}
		
			
				
				
	public void whileloop()
	{
		int[] marks = { 78,98,79,80,35};
		
	 
	 // index 0 1 2 3 4 
	 int i=0;
	 while(i<=4)
	 {
		 System.out.println(marks[i]);
		 i++;
	 }

}
	public void forloop()
	{
		int[] marks = { 78,98,79,80,35};
		for(int i=0;i<=1;i++)
		{
			System.out.println(marks[i]);
		}
		
	}
	public void properties()
	{
		int[] marks = { 78,98,79,80,35};
	//	System.out.println(marks.length);
		
		for(int i =0;i<=marks.length-1;i++)      
		{
			if(marks[i]%2!=0)
			{
				System.out.println(marks[i]);
			}
		}
		
	}
	public void totalArray()           // sum
	{
		int[] marks = { 88,79,100,34,95};
		int total=0;
		int index=0;
		while(index<marks.length) {
			total = total+marks[index];
			index =index+1;
		}
		System.out.println(total);
		System.out.println(total/marks.length);
	}
}

