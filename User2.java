public class User2 implements User
{

//public User2()
//{
//System.out.println("Constructor");
//}

public static void main(String[]args)
{
User us = new User2();
us.lastName();
us.firstName();
us.signIn();
us.password();
//us.missing();
//us.value = 25;
System.out.println(User.value);
System.out.println(User2.value);
System.out.println(us.value);

}

public void lastName()
{
     System.out.println("Last Name Print");
	 }


public void firstName()
{
 System.out.println("First Name Print");
 }
 
 public void signIn()
 {
 System.out.println("signIn Print");
 }
 //public void missing()
 //{
 //System.out.println("missing");
 //}
 public void password()
 {
 System.out.println("password Printing");
 }
 
 }
 



 
 

	 
	 
	 


