package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
	
/*	Given an array of integers, where all elements but one occur twice, find the unique element. 
	 */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lonelyinteger(null);

	}

	public static int lonelyinteger(List<Integer> a) {
		int resp = -1;
		
		while (a.size() > 0) {
			int i = a.get(0);
			a.remove(0);
			if (!(a.contains(i))) {
				return i;
			} else {
				a.remove(a.indexOf(i));
			}
		}		
		
		return resp;
	}

}
