package TaskProgram111;

public class Tasks1 {
	public static void main(String[]agrs) {
		Tasks1 wl =new Tasks1();
		wl.calculateAmount(0);

		}
		//Scenario#1
		void calculateAmount(int amount)
		{
		int day=1;
		while(day<=10)
		{
		amount =amount+day;
		System.out.println("Day "+ day+" , Daughthe earn "+amount);
		day=day+1;

		}
		System.out.println("Total Amount is " + amount);

		}


	}


