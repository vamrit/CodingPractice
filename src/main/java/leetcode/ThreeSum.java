package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class ThreeSum {

//	Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//			Notice that the solution set must not contain duplicate triplets.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = new int [] {-1,0,1,2,-1,-4};
		ThreeSum t = new ThreeSum();
		System.out.println(t.threeSum(input));
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
        
		List<List<Integer>> response = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i<nums.length; i++) {
			int target = 0 - nums[i];
			int left = i+1;
			int right = nums.length-1;
			while (right>left) {
				if (nums[left]+nums[right] == target) {
					List <Integer> l =  Arrays.asList(nums[i],nums[left],nums[right]);
					Collections.sort(l);
					response.add(l);
					left += 1;
					right -=1;
				} else if (nums[left]+nums[right] < target) {
					left += 1;
				} else {
					right -=1;
				}
			}
		}
		response = new ArrayList(new LinkedHashSet<>(response));
        return response;
        
    }

}
