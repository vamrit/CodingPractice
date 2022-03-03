package leetcode;

public class RepeatedStringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(repeatedStringMatch("abc","cabcabca"));
//		System.out.println(repeatedStringMatch("a","a"));
//		System.out.println(repeatedStringMatch("aa","a"));
//		System.out.println(repeatedStringMatch("a","aa"));
		System.out.println(repeatedStringMatch("abc","cabcabca"));

	}

	public static int repeatedStringMatch(String a, String b) {
		int count = 1;
		if (a.contains(b) || a == b || a.equals(b)) 
			return count;
		String temp = a;
		while (a.length() <= b.length() * b.length()) {
			if (a.contains(b) || a == b || a.equals(b)) {	
				System.out.println(a);
				System.out.println("count is " + count);
				return count;
			} else {
				a = a.concat(temp);
				count = count +1;
				System.out.println("new a : " + a);
				System.out.println("new count : " + count);
			}
		}
		return -1;
	}

}
