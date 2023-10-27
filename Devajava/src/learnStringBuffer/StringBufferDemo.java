package learnStringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		String[]ar= {"Deva","Raj","King"};
		String conact ="";
		StringBuffer sb = new StringBuffer("");
		for(String name :ar) {
			sb.append(name);
			}
		//System.out.println(sb);

//	
//	StringBuffer sb2 = new StringBuffer("devaraj");
//	//sb2.reverse();
//	System.out.println(sb2);
//	//sb2.replace(1, 3, "a");
//	System.out.println(sb2);
//	sb2.insert(3, "abc");
//	System.out.println(sb2);
		
		StringBuilder sb2 = new StringBuilder("devaraj");
		sb2.reverse();
	    System.out.println(sb2);
		sb2.replace(1, 3, "a");
		System.out.println(sb2);
		sb2.insert(3, "abc");
		System.out.println(sb2);
		
				

}
}




