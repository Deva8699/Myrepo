package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LearnFile {

	public static void main(String[] args) throws IOException {
		File ff = new File("/home/devaraj/Pictures/raja/java1.txt");
		try {
		System.out.println(ff.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(ff.canWrite()) {
			FileWriter pen = new FileWriter(ff,true);
			pen.write('1');
			pen.write('2');
			pen.write('3');
			pen.write('4');
			pen.flush();
			pen.close();
			
		}
		if(ff.canRead()) {
			FileReader reader = new FileReader(ff);
			int ch= reader.read();
			while(ch!=-1) {
				System.out.println((char)ch);
				ch=reader.read();
			}
		}

	}

}
