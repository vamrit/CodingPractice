package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	private static int romanToInteger (String s) {
		Map <Character, Integer> val = new HashMap<Character, Integer> ();
		val.put('I', 1);
		val.put('V', 5);
		val.put('X', 10);
		val.put('L', 50);
		val.put('C', 100);
		val.put('D', 500);
		val.put('M', 1000);
		int total = 0;
		
		char [] ch = s.toCharArray();
		
		for (int i =0; i< ch.length; i++) {
			char c1 = ch[i];
			char c2 = ch[i+1];
			if (val.get(c1)>val.get(c2)) {
				total += val.get(c1);
			} else {
				total -= val.get(c1);
			}		
		}
		return total;
	}
}
