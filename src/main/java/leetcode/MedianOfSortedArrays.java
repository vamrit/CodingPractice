package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5. */
 

public class MedianOfSortedArrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double response = 0.0;
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        list1.addAll(list2);
        Collections.sort(list1);
        
        if (list1.size()%2 == 0 ) {
            response = (double) (list1.get(list1.size()-1) + list1.get(list1.size()))/2;
        } else {
            response = (double) list1.get(list1.size()-1);
        }
        return response; 
    }
}

