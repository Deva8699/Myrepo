package TaskProgram111;

public class Tasks2 {

	public static void main(String[] args) {
		Tasks2 wl =new Tasks2();
		wl.calculateSecurity(1024);

		}
		//Scenaio#2
		void calculateSecurity(int beats)
		{
		int security =0;
		while(beats>1)
		{
		beats=beats/2;
		security=security+1;
		System.out.println("Total No. of Beats "+ beats +". The security is number is  " + security);
		}
		System.out.println("Last 1 beat take Tenali Raman.");
		System.out.println("Total No. of Securities " + security);
		}

	}


