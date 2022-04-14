package leetcode;

import java.util.Random;

public class FirstBadVersion {
	
//	https://leetcode.com/problems/first-bad-version/submissions/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int firstBadVersion(int n) {
        if (n == 1)
            return 1;
        int first = -1;
        int last = n;
        while (first<=last) {
            int mid = first + (last -first)/2;
            if (isBadVersion(mid)) {
                last = mid-1;
            } else {
                first = mid+1;
            }
          
        }
        return first;
    }
	
	
	public static boolean isBadVersion(int n) {
		Random random = new Random();
        return random.nextBoolean(); 
	}

}
