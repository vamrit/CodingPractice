package leetcode;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(twoSum(new int[] { 1, 5, 3, 4, 7 }, 10)));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] response = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					response[0] = i;
					response[1] = j;
					return response;
				}
			}
		}

		return response;
	}

}
