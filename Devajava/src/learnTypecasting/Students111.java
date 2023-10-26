package learnTypecasting;

public class Students111 {
	
 String name;
	public Students111(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		
		Students111 student = new Students111("Deva");
		
		String name = new String("Raja");   //default ah tostring method irukum
		
		System.out.println(student);
		System.out.println(name);
		
	}

	@Override
	public String toString() {
		return "Students111 [name=" + name + "]";
	}
	
}
