package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		String password = "Chennai is the capital of TamilNadu";
		 // Pattern patternObj = Pattern.compile("TamilNadu$");
		 // Pattern patternObj = Pattern.compile("^Chennai");
		 // Pattern patternObj = Pattern.compile("^Chennai | TamilNadu$");
		  Pattern patternObj = Pattern.compile("^Chennai |tamilNadu$");
		    Matcher matcherObj = patternObj.matcher(password);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		    }

	}

}
