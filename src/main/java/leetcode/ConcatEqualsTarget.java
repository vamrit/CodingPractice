package leetcode;

/**
 * @author Vijay Amrit
 * @date 3/23/22
 *
 * https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/
 */

public class ConcatEqualsTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int numOfPairs(String[] nums, String target) {
        int response = 0;
        for (int i = 0; i < nums.length; i++) {
        	for (int j=i+1; j<nums.length; j++) {
        		if ((nums[i].concat(nums[j])).equals(target)) {
        			response = response +1;
        		}
                if ((nums[j].concat(nums[i])).equals(target)) {
                    response = response +1;
                }
        	}
        }
        
        return response;
	}
}
        