package Roughwork;

public class Rough_work {
	public static void main(String[] args)
	{
		Rough_work RW = new Rough_work();
		//RW.2Addnumbers();
		RW.PrintNumbers();
	}
	
	public void 2Addnumbers()
		int count = 1;
		while (count<=5)
		{
			System.out.print(count*2 + " ");
			count=count+1;
		}
}
	
	public void PrintNumbers()
	{
		for(int i=1; i<=10; i++)
        {
            System.out.println(i);
        }
	}
}

