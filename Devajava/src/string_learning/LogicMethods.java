package string_learning;

public class LogicMethods {
	public static void main(String[] args) {
		LogicMethods Lm = new LogicMethods();
		//Lm.method1();
		//Lm.method11();
		//Lm.method111();
		Lm.method12();
		
	}

	
	public void method12()
	{
		String str = "Welcome Devaraj";  
        int count = 0;  
        for (int i=0; i<=str.length()-1; i++) {  
            if(str.charAt(i) == 'e') {  
                count++;  
            }  
        }  
        System.out.println("Frequency of e is: "+count);  
    }  
	
	public void method111()
	{
		 String str = "My name is Devaraj";          
	        for (int i=0; i<=str.length()-1; i++) {  
	            if(i%2!=0) {  
	                System.out.println("Char at "+i+" place "+str.charAt(i));  
	            }  
	        }  
	}
	
	public void method1()    //1.charAt(0)
	{
		String name="Devaraj";
		char ch =name.charAt(5);
		System.out.println(ch);
				
	}
	
	public void method11()
	{
		 String str = "My name is Devaraj";      
		    int strLength = str.length();      
		    // Fetching first character  
		    System.out.println("Character at 0 index is: "+ str.charAt(0));      
		    // The last Character is present at the string length-1 index  
		    System.out.println("Character at last index is: "+ str.charAt(strLength-1));      
		    }  
	}


