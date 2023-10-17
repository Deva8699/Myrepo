package string_learning;

public class LogicMethods3 {
public static void main(String[] args) {
	LogicMethods3 LM = new LogicMethods3();
	//LM.methods1();
//	LM.methods2();
	//LM.methods3();
	LM.methods4();
}


public void methods1() {    //to Upper case
	
	
	String a = "devaraj";
	
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)>='a' && a.charAt(i)<='z') {
			System.out.print((char)(a.charAt(i)-32));
		}else
			System.out.print(a.charAt(i));
	}
	
	public void methods2()       //tolower case
	{
		String b = "DEVARAJ";
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)>='A' && b.charAt(i)<='Z') {
				System.out.print((char)(b.charAt(i)+32));
			}else
				System.out.print(b.charAt(i));
		}
		
		public void methods3()     //SubString()
		{
			String s = "Devarajking";
			for(int i=8;i<=s.length();i++) {
				System.out.println(s.charAt(i));
			}
			public void methods4()
			{
				String d ="NeutonProtonElectron";
				char[] ch=d.toCharArray();
				for(int i=0;i<d.length();i++) {
					System.out.print(ch[i]);
				}
					
			}
			
			
			
		}
		
	
	





