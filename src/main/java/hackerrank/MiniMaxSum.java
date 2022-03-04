package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
	
	
/*	Given five positive integers, find the minimum and maximum values that can be
 *  calculated by summing exactly four of the five integers. Then print the respective
 *   minimum and maximum values as a single line of two space-separated long integers.

	Example
	The minimum sum is  and the maximum sum is . The function prints
	16 24 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> input = new ArrayList<Integer>();
		input.add(256741038);
		input.add(623958417);
		input.add(467905213);
		input.add(714532089);
		input.add(938071625);
		miniMaxSum(input);
		
	}
	
	public static void miniMaxSum(List<Integer> arr) {
	    Collections.sort(arr);
	    Long min=0l, max=0l;
	    for (int i =0 ; i<arr.size(); i++) {
	    	if (i < arr.size()-1) {
	    		min = min + arr.get(i);
	    	}
	    	if (i>0) {
	    		max = max + arr.get(i);
	    		System.out.println(max);
	    	}
	    }
	    System.out.println(min + " " + max);

	}

}
