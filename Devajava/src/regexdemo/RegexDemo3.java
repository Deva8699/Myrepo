package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		String mobile = "4884012810";
		  Pattern patternObj = Pattern.compile("[6-9][0-9]{9}");
		    Matcher matcherObj = patternObj.matcher(mobile);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		    }

	}

}
