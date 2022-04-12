package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {
	
//	https://leetcode.com/problems/find-lucky-integer-in-an-array/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = new int[] {2,2,3,4};
		System.out.println(findLucky(input));
	}
	
	public static int findLucky(int[] arr) {
        int response = -1;
        Map <Integer, Integer> myMap = new HashMap <Integer, Integer>();
        
        for (int i = 0; i<arr.length; i++){
            if (myMap.get(arr[i]) == null) {
                myMap.put(arr[i], 1);
            } else {
                myMap.put(arr[i], myMap.get(arr[i])+1);
            }
        }
        
        for (java.util.Map.Entry<Integer, Integer> e : myMap.entrySet()) {
        	System.out.println(e.getKey()+ "::" + e.getValue());
        }
        
        for (java.util.Map.Entry<Integer, Integer> e : myMap.entrySet()) {
            if (e.getKey() == e.getValue()) {
                if (e.getKey() > response)
                    response = e.getKey();
            }
        }
         return response;   
        
        
    }

}
