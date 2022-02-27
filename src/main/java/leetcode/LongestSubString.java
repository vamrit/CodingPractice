package leetcode;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestSubString("abcabcbb"));
		System.out.println(longestSubString("bbbbb"));
		System.out.println(longestSubString("pwwkew"));
		System.out.println(longestSubString("a"));
		System.out.println(longestSubString(""));
		System.out.println(longestSubString(" "));
		System.out.println(longestSubString("jky"));
	}

	public static int longestSubString(String s) {

		if (s.equals(null) || s.length() < 1) {
			return 0;
		}

		StringBuilder sb = new StringBuilder();
		char[] inputChars = s.toCharArray();
		int size = 1;

		for (char c : inputChars) {
			if (sb.indexOf(Character.toString(c)) == -1) {
				sb.append(c);
			} else {
				sb.replace(0, sb.indexOf(Character.toString(c)), "");
				sb.append(c);
			}
			if (size < sb.length())
				size = sb.length();
		}
		return size;
	}

}
