package learn_Exception;

import java.io.File;
import java.io.IOException;

public class File_Handling {
	public static void main(String[] args) {
		
		File ff = new File("/home/devaraj/Pictures/raja/java.txt");
		try {
			ff.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Check path");
		}
				

	}
}
	