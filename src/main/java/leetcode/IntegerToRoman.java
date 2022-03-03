package leetcode;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1;i<9999;i++) {
		    System.out.println("i="+i+" -> "+convertIntegerToRoman(i));
		  }

	}
//	val.put('I', 1);
//	val.put('V', 5);
//	val.put('X', 10);
//	val.put('L', 50);
//	val.put('C', 100);
//	val.put('D', 500);
//	val.put('M', 1000);
	
	private static String convertIntegerToRoman (int num) {
		if (num<1)
			return "";
		
		StringBuffer sb = new StringBuffer();
		LinkedHashMap <String, Integer> myMap = new LinkedHashMap <String, Integer>();
		
		myMap.put("M", 1000);
		myMap.put("CM", 900);
		myMap.put("D", 500);
		myMap.put("CD", 400);
		myMap.put("C", 100);
		myMap.put("XC", 90);
		myMap.put("L", 50);
		myMap.put("XL", 40);
		myMap.put("X", 10);
		myMap.put("IX", 9);
		myMap.put("V", 5);
		myMap.put("IV", 4);
		myMap.put("I", 1);
		
//		String [] romans = new String [] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//		int [] numbers = new int [] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		
		
		for (Entry <String, Integer> e : myMap.entrySet()) {
			while (num >= e.getValue()) {
				sb.append(e.getKey());
				num = num - e.getValue();
			}
		}
		
		
		return sb.toString();
	}

}
