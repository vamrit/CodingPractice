package leetcode;

public class RemoveElement {
//	https://leetcode.com/problems/remove-element/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i] != val){
                nums[count] = nums [i];
                count++;
            }
            
        }
        return count;
        
	  }
}
