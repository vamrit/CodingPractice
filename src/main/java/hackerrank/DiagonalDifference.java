package hackerrank;

import java.util.List;

public class DiagonalDifference {
	
    public static int diagonalDifference(List<List<Integer>> arr) {
    	int response = 0;
    	int d1 = 0;
    	int d2 = 0;
    	int arrSize = arr.size();
    	
    	for (int i=0; i< arrSize; i++) {
    		for (int j=0; j<arrSize; j++) {
    			if ( i == j) {
    				d1 = d1 + arr.get(i).get(j);
    			}
    			if (i+j == arrSize -1) {
    				d2 = d2 + arr.get(i).get(j);
    			}
    		}
    	}
    	return Math.abs(d1-d2);
    	      
    }


}
