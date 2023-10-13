public class Employee extends IndianEmp implements Rules
{
public static void main(String[]args)
{
Employee emp = new Employee();  //Rules
emp.HardWork();
emp.comeonTime();
emp.takeLeave();
emp.getSalary();
//emp.nofLeaves = 20;
System.out.println(emp.noOfLeaves);  //variables
System.out.println(Rules.noOfLeaves);
System.out.println(Employee.noOfLeaves);
emp.leisure();

}
public void leisure()
{
}

public void comeonTime()
{
System.out.println("9Am");
}

public void takeLeave()
{
System.out.println("will inform");
}

public void getSalary()
{
System.out.println("on 1st every month");
}
}

