package string_learning;

public class LogicMethods1 {
	public static void main(String[] args) {
		
		LogicMethods1 Lm = new LogicMethods1();
		Lm.Methods13();
		
		
	}
	
	public void Methods13()     //13.isEmpty()
	{
		String s1="";    
        String s2="Devaraj";             
        // Either length is zero or isEmpty is true  
        if(s1.length()==0 || s1.isEmpty())  
            System.out.println("String s1 is empty");  
        else System.out.println("s1");        
        if(s2.length()==0 || s2.isEmpty())  
            System.out.println("String s2 is empty");  
        else System.out.println(s2);  
    }  
	}


