package string_learning;

public class Trimmethod {
	public static void main(String[] args) {
		
		String Name = "       Deva  raj    ";
		String result = " ";
		for(int i=0;i<Name.length();i++) {
			if(Name.charAt(i) != ' ') {
				result+=Name.charAt(i);
			}
		}
		System.out.println(result);
			
	}

}
