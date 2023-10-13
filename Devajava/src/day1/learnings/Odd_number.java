package day1.learnings;

public class Odd_number {
	public static void main(String[] args) {
		int count=1;
		while(count<=10)
		{
			if(count%2!=0) {
				System.out.println(count);
			}
			count=count+1;
		}
	}

}
