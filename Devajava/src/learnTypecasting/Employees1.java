package learnTypecasting;

public class Employees1 extends Students1{
	public static void main(String[] args) {
		
		Students1 student = new Employees1();      // Dynamic Binding
		student.study();
	//	student.doprojects          //Downcasting
		Employees1 employees = (Employees1)student;
		employees.doprojects();
		employees.study();
		
		
		
		
		
//		Employees1 employees = new Employees1();
//		employees.doprojects();
//		employees.study();
//		//up casting
//		Students1 student =(Students1)employees;
//		student.study();
//		
	}

	public void doprojects() {
		System.out.println("Doing Projects");
		
	}

}
