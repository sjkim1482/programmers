package programmers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHandlingBasics {

	public static void main(String[] args) {
		
		String s ="a234";
		boolean answer = true;
        String str1 = "[0-9]{4}|[0-9]{6}";
		Pattern pid = Pattern.compile(str1);
		Matcher mid = pid.matcher(s);
		answer = mid.matches();
		
		System.out.println(answer);
	}

}
