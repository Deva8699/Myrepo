package class_test_programs;

public class Programs {
	public static void main(String[] args) {
		Programs PP = new Programs();
		//PP.test1();
		//PP.test2();
		//PP.test3();
		//PP.test4();
		//PP.test5();
		//PP.test6();
		//PP.test7();
		//PP.test8();
		//PP.test9();
		//PP.test10();
		PP.test11();
		
		
	}
	public void test11()   // 4.PRINT ALL CHARACTERS IN LOWER CASE
	{

		String name = "WORLDCUP";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='A' && name.charAt(i)<='Z') {
				System.out.print((char)(name.charAt(i)+32));
			}else
				System.out.print(name.charAt(i));
		}
	}
	public void test10()     //3.print all characters in capital
	{
		String name = "worldcup";
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='a' && name.charAt(i)<='z') {
				System.out.print((char)(name.charAt(i)-32));
			}else
				System.out.print(name.charAt(i));
		}
	}
	public void test9()     //2.print without space
	{
		String name = " World Cup ";
       // printWithoutSpace(name);
   // }

  //  public static void printWithoutSpace(String name) {
        String result = name.replace(" ", "");
        System.out.println(result);
    }
	
	
	public void test8()   //1.print captial letters
	{
		String name = " World Cup ";
       // printCapitalLetters(name);
   // }

   // public static void printCapitalLetters(String name) {
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print(c);
            }
        }
        System.out.println();
    }
	
	public void test6()        // print divisors of 5 
	{
		 double[] ar = {12, 78, 67, 76, 80};
	        for (int i = 0; i < ar.length; i++) {
	            if (ar[i] % 5 == 0) {
	                System.out.println(ar[i]);
	            }
	        }
	}
	public void test7()       // print highest value
	{
	        double[] ar = {12, 78, 67, 76, 80};
	        double max = ar[0];
	        for (int i = 0; i < ar.length; i++) {
	            if (ar[i] > max) {
	                max = ar[i];
	            }
	        }
	        System.out.println(max);
	    }
	
	
	public void test5()    // print below 50
	{
		double[] ar = {12, 78, 67, 76, 80};
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 50) {
                System.out.println(ar[i]);
            }
        }
        
	}
	public void test4()
	{
		for (int i = 1; i <= 100; i++) {
            if (4 % i == 0) {
                System.out.println(i);
            }
		}
		
	}
	public void test3()
	{
		for (int i = 1; i <= 10; i++) {
            System.out.println(3 * i);
        }
	}
	


	public void test2()
	{
		for(int i=1;i<=3;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print(j+" ");
		}
		System.out.println( );
		}
		
	}
	
	public void test1()
	{
		
		for(int i=1;i<=9;i++) {
			System.out.println(i+"");
			i=i+1;
		}
		
		
	}
	

}
