package learnTypecasting;

public class Employee extends Students {
	
	public static void main(String[] args) {
		//Down casting
		
		Students student = new Employee();
		student.Study();
		//student.doprojects();
		Employee employee = (Employee)student;
		employee.doprojects();
		employee.Study();
		
		//Up-casting
	//	Employee employee = new Employee();
		//employee.doprojects();
		//employee.Study();
		//Up-casting
		//Students student =(Students)employee;
		
		//student.Study();
	}

	public void doprojects() {
		
		System.out.println("doing projects");
		
		
	}

}
