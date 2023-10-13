public class Deva        
{

public static void main(String[]args)
{



//int count=1;
//while(count<=5)
//{
//System.out.println(count*3);   // 1 2 3 4 5 
//count=count+1;
//}
	
	//----------------------------------------------->
	
	//modules operator  %       1 2 3
	 //                         1 2
		//						1
	                        //  0        
//	int no1=1234;
//	int div = 10;
//	while(no1!=0)
//	{
//		System.out.println(no1/div);
//		no1=no1/div;
//	}
//}
	
	//------------------------------------------>
	
	//modules operator  %       1 2 3
	 //                         1 2
		//						1
	                        //         
	//int no1=1234;
	//int div = 10;
	//while(no1>1)       //1234    123  12 
	//{
		//System.out.println(no1/div);
		//no1=no1/div; 123    12
	//}
	
	//-------------------------------------------->
	
	// 4 3 2 1
	//int no=1234;
	//while(no>0)
	//{
		//System.out.print(no%10);
	   // no=no/10;
	//}
	
	//int no=1234;                             //4
    //while(no>0)                               //3
	//{                                          //2
 	//	System.out.println(no%10);              //1
	 //   no=no/10;
	//}
	
	int no=1234;   
	int noOfDigits=0;    
	while(no>0)
	{
		//System.out.println(no%10);   
	    no=no/10;
		noOfDigits = noOfDigits + 1;
	}
		System.out.println(noOfDigits);
	
	
	
	
}
}

	
	
	




		  