package hackerrank;

import java.util.Collections;
import java.util.List;

public class CollectionMedian {
	
	/* The median of an array is its middle element after sorting.
	 * Given a List of integers having odd size, Find its median
	 */
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int Median (List <Integer> arr) 
	{
		Collections.sort(arr);
		return (arr.get(arr.size()/2));
	}

}
