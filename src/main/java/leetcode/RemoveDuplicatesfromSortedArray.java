package leetcode;

public class RemoveDuplicatesfromSortedArray {
//	https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int removeDuplicates(int[] nums) {
	        int count = 0;
	        for (int i=0; i< nums.length; i++) {
	            if (i<nums.length-1 && nums[i] == nums[i+1] )
	                continue;
	            nums [count] = nums [i];
	            count++;
	        }
	        return count;
	    }

}
