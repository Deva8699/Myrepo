package TaskProgram111;

public class Tasks3 {
	public static void main(String[] args) {
	Tasks3 wl =new Tasks3();
	wl.calculateDosai(8);

	}
	//Scenario#3
	void calculateDosai(int dosai)
	{
	int count=3;
	while(count >=1)
	{

	dosai=dosai+dosai/2;
	count=count-1;
	System.out.println("No. of Times Count is "+count+" . Total No. of Dosai is " + dosai);
	}
	System.out.println("Total No. of Dosai made " + dosai);
	}
}
