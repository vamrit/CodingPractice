package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
//	https://leetcode.com/problems/valid-parentheses/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean isValid(String s) {
		 
		 Stack <Character> st = new Stack<Character>();
		 Map <Character, Character> map = new HashMap<Character, Character>();
		 map.put(')', '(');
		 map.put('}', '{');
		 map.put(']', '[');
		 char [] ch = s.toCharArray();
		 for (char c : ch) {
			 if (map.containsValue(c)) {
				 st.push(c);
			 } else {
				 if (st.isEmpty())
					 return false;
				 else {
					 if (st.pop() != map.get(c))
						 return false;					 
				 }
					 
							 
			 }
				 
		 }
		 if (st.isEmpty())
			 return true;
		 else 
			 return false;
	        
	 }

}
