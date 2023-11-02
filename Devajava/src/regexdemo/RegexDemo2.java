package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		String password = "Chennai is the capital city3425";
		  //Pattern patternObj = Pattern.compile("\\s");
		 // Pattern patternObj = Pattern.compile("\\S");
		Pattern patternObj = Pattern.compile("\\D");
		//Pattern patternObj = Pattern.compile("\\d");
		    Matcher matcherObj = patternObj.matcher(password);
		    int count = 0;
		    while(matcherObj.find())
		    {
		      count++;
		      System.out.print(matcherObj.group());
		    }
		    System.out.println(count);
		

	}

}
