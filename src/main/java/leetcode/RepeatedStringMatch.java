package leetcode;

import java.util.Collections;

public class RepeatedStringMatch {
//	https://leetcode.com/problems/repeated-string-match/
	
/*	Given two strings a and b, return the minimum number of 
	times you should repeat string a so that string b is a substring of it.
	If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1. */


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(repeatedStringMatch("abc","cabcabca"));
//		System.out.println(repeatedStringMatch("a","a"));
//		System.out.println(repeatedStringMatch("aa","a"));
//		System.out.println(repeatedStringMatch("a","aa"));
		System.out.println(repeatedStringMatch("abc","cabcabca"));

	}
	
	public static int repeatedStringMatch(String a, String b) {
		
		final int n = (int) Math.ceil((double) b.length() / (double) a.length());
		System.out.println(n);
	    final String s = String.join("", Collections.nCopies(n, a));
	    System.out.println(s);
	    if (s.contains(b))
	      return n;
	    if ((s + a).contains(b))
	      return n + 1;
	    return -1;
		

	}

}
