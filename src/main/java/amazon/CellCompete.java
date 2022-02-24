package amazon;

import java.util.Arrays;

public class CellCompete {
	

 /**
 * @author Vijay Amrit
 * @date 02/23/2022
 *
 * https://stackoverflow.com/questions/39171403/cell-complete-problems
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Arrays.toString(compete(new int[]{1,0,0,0,0,1,0,0}, 1)));
		System.out.println(Arrays.toString(compete(new int[]{1,1,1,0,1,1,1,1}, 2)));
	}
	
	public static int[] compete(int [] input, int days) {
//	public static void compete(int [] input, int days) {
		
		int [] temp = new int[input.length];
		System.out.println(Arrays.toString(input));
		
		while (days --> 0) {
			for (int i = 0; i < input.length; i++) {
				
				if (i == 0) {
					if (input[i+1] == 0)
						temp[i] = 0;
					else
						temp [i] = 1;
				} else if (i == input.length - 1) {
					if(input [i-1] == 0 ) 
						temp[i] = 0;
					else
						temp [i] = 1;
				} else {
					if ((input[i-1]==0 && input[i+1]==0)||(input[i-1]==1 && input[i+1]==1)) {
						temp[i] = 0;
					} else {
						temp [i] = 1;
					}
				}
			}
			input = temp;
			System.out.println(Arrays.toString(temp));
			System.out.println(Arrays.toString(input));
		}
			
		return input;
		
	}

}
