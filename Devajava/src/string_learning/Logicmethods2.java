package string_learning;

public class Logicmethods2 {
	public static void main(String[] args) {
		Logicmethods2 Lm = new Logicmethods2 ();
		Lm.methods();
		
	}
	public void methods()
	{
		String name="Devaraj";
		for(int i=0;i<name.length()-1;i++)
		{
			if(name.charAt(i)=='D')
			{
				return i;
			}
		}
	}
	

}
