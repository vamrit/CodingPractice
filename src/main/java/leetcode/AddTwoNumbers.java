package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<Integer>(Arrays.asList(2, 4, 3));
		LinkedList<Integer> l2 = new LinkedList<Integer>(Arrays.asList(5, 6, 4));

		LinkedList<Integer> l3 = new LinkedList<Integer>(Arrays.asList(0));
		LinkedList<Integer> l4 = new LinkedList<Integer>(Arrays.asList(0));

		LinkedList<Integer> l5 = new LinkedList<Integer>(Arrays.asList(9, 9, 9, 9, 9, 9, 9));
		LinkedList<Integer> l6 = new LinkedList<Integer>(Arrays.asList(9, 9, 9, 9));

		sum(l1, l2);
		sum(l3, l4);
		sum(l5, l6);
	}

	private static LinkedList<Integer> sum(LinkedList<Integer> a, LinkedList<Integer> b) {
		int num1 = getNumFromList(a);
		int num2 = getNumFromList(b);
		int sum = num1 + num2;
		if (sum == 0) {
			return new LinkedList<Integer>(Arrays.asList(0));
		}
		System.out.println("sum is : " + sum);
		LinkedList<Integer> c = new LinkedList<Integer>();
		while (sum > 0) {
			c.add(sum % 10);
			sum = sum / 10;
		}

		System.out.println(c);
		return c;
	}

	private static int getNumFromList(LinkedList<Integer> t) {
		int num = 0;
		for (int i = t.size() - 1; i >= 0; i--) {
			num = (num * 10) + t.get(i);
		}
		return num;
	}

}
