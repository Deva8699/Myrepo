public class Calculator
{
 
 public static void main(String[]args)
 {
    Calculator calc = new Calculator();
	 int result=calc.add(5,10);
	 double value=calc.add(2.5,3.7);
 }
	
	public int add(int a,int b)            
	{
       System.out.println(a+b);
	return a+b;
	}
	 
	public double add(double a,double b) 
	 {
        System.out.println(a+b);
		 return a+b;
	 }
 }
	
	