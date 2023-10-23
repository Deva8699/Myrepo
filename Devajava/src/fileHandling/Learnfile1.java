package fileHandling;

import java.io.File;

public class Learnfile1 {

	public static void main(String[] args) {
		File ff = new File("/home/devaraj/Downloads");
	File[]ar= ff.listFiles();
	
	for(int i=0;i<ar.length;i++) {
		if(ar[i].isFile()) {
			String str =ar[i].getName();
			if(str.endsWith(".odt")) {
				System.out.println(ar[i].getName());
			}
		}
		
	}
		

	}

}
