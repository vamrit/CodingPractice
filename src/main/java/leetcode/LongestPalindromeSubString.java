package leetcode;

public class LongestPalindromeSubString {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
		System.out.println(longestPalindrome("cbbd"));
		System.out.println(longestPalindrome(""));
		System.out.println(longestPalindrome("a"));
	}

	public static String longestPalindrome(String s) {
		if (s.length() == 1) {
			return s;
		}
		String response = "";
		int len = 0;
		String tempString;

		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length() - 1; j > i; j--) {
				tempString = s.substring(i, j);
				if (isPalindrome(tempString)) {
					if (len < tempString.length()) {
						len = tempString.length();
						response = tempString;
					}
				}
			}
		}

		return response;

	}

	public static boolean isPalindrome(String input) {
		StringBuilder sb = new StringBuilder(input);
		if (input.equals(sb.reverse().toString())) {
			return true;
		} else {
			return false;
		}
	}

}
