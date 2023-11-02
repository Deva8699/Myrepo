package regexdemo;

import java.util.regex.Pattern;

public class RegexDemo5 {

	public static void main(String[] args) {
		String pattern = "-";
	       String input = "28-March-2023";
	            Pattern patternObj = Pattern.compile(pattern);
	            String[] items = patternObj.split(input);
	            for(int i=0;i<items.length;i++)
	            {
	              System.out.println(items[i]);
	            }

	}

}
