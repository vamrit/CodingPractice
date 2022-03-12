package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainerWithMostWater {
	
	public static void main ( String [] args) {
	
		int [] height = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	
	public static int maxArea(int[] height) {
		if (height == null || height.length<2)
			return 0;
        int area = 0;
        int response = 0;
        int min = 0;
        for (int i = 0; i < height.length-1; i++) {
        	for (int j = i+1; j < height.length; j++) {
        		min = (height[i] > height[j]) ?  height[j] : height[i];
        		area = min * (j-i);
        		if (area > response)
        			response = area;
        		
        	}
        }
        
        return response;
    }

	public boolean isMatch(String s, String p) {
        
        Pattern p1 = Pattern.compile(p);
        Matcher m1 = p1.matcher(s);
        return m1.matches();
        
    }
}
