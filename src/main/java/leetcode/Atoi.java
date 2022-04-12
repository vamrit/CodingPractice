package leetcode;

public class Atoi {
	
//	https://leetcode.com/problems/string-to-integer-atoi/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(myAtoi(" 0123"));
		System.out.println(myAtoi("123"));
		System.out.println(myAtoi(" 123"));
		System.out.println(myAtoi("-2123"));
		System.out.println(myAtoi("+2123"));
		System.out.println(myAtoi("+ 2123"));
		System.out.println(myAtoi("+ "));
		System.out.println(myAtoi("-91283472332"));
		System.out.println(myAtoi("-+12"));
	}

	public static int myAtoi(String s) {
		StringBuffer sb = new StringBuffer();
		s = s.trim();
		int response = 0;
		boolean negative = false;
		Long temp = 0L;
		Character plus = '+';
		Character minus = '-';

		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && minus.equals(s.charAt(i))) {
				negative = true;
				continue;
			}
			if ((i == 0 && plus.equals(s.charAt(i))))
				continue;
			if (Character.isDigit(s.charAt(i))) {
				sb.append(s.charAt(i));
				temp = Long.valueOf(sb.toString());
			} else {
				break;
			}
		}
		if (negative)
			temp = temp * -1;
		if (temp < Integer.MIN_VALUE)
			response = Integer.MIN_VALUE;
		else if (temp > Integer.MAX_VALUE)
			response = Integer.MAX_VALUE;
		else
			response = temp.intValue();
		return response;

	}

}
