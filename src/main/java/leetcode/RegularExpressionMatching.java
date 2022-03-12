package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isMatch(String s, String p) { 
        Pattern p1 = Pattern.compile(p);
        Matcher m1 = p1.matcher(s);
        return m1.matches();
    }

}
