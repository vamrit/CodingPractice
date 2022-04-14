package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(twoSum(new int[] { 1, 5, 3, 4, 7 }, 10)));
		System.out.println(Arrays.toString(twoSum2(new int[] { 1, 5, 3, 4, 7 }, 10)));
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
	
	public static int[] twoSum2(int [] nums, int target) {
		int[] response = new int[2];
		Map <Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for (Entry <Integer, Integer> e : map.entrySet()) {
			int required = target - e.getKey();
			if (map.get(required) != null) {
				response [0] = e.getValue();
				response [1] = map.get(required);
				return response;
			}
		}
		
		return response;
	}
	
	
	

}
