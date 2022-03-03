package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberToWords(123));
		System.out.println(numberToWords(3123));
		System.out.println(numberToWords(32123));
		System.out.println(numberToWords(17123));
	}
	
	 public static String numberToWords(int num) {
		 StringBuffer sb = new StringBuffer();
		 String temp = "";
		 LinkedHashMap <Integer, String> myMap = new LinkedHashMap<Integer, String>();
		 myMap.put(1000000000, "Billion");
		 myMap.put(1000000, "Million");
		 myMap.put(1000,  "Thousand");
		 myMap.put(100, "Hundred");
		 myMap.put(90, "Ninety");
		 myMap.put(80, "Eighty");
		 myMap.put(70, "Seventy");
		 myMap.put(60, "Sixty");
		 myMap.put(50, "Fifty");
		 myMap.put(40, "Forty");
		 myMap.put(30, "Thirty");
		 myMap.put(20, "Twenty");
		 myMap.put(19, "Nineteen");
		 myMap.put(18, "Eighteen");
		 myMap.put(17, "Seventeen");
		 myMap.put(16, "Sixteen");
		 myMap.put(15, "Fifteen");
		 myMap.put(14, "Fourteen");
		 myMap.put(13, "Thirteen");
		 myMap.put(12, "Twelve");
		 myMap.put(11, "Eleven");
		 myMap.put(10, "Ten");
		 myMap.put(9, "Nine");
		 myMap.put(8, "Eight");
		 myMap.put(7, "Seven");
		 myMap.put(6, "Six");
		 myMap.put(5, "Five");
		 myMap.put(4, "Four");
		 myMap.put(3, "Three");
		 myMap.put(2, "Two");
		 myMap.put(1, "One");
		

		 int count = 0;
		 
		 for (Map.Entry<Integer, String>  e : myMap.entrySet()) {
			 while (num >= e.getKey()) {
				 count = count + 1;
				 num = num - e.getKey();
			 }
			 if (count > 0) {
				 if (count>19)
					 temp = numberToWords(count);
				 else 
					 temp = myMap.get(count);
				 if (e.getKey() > 90) {
					 sb.append(temp + " "  + e.getValue() + " "); 
				 } else {
					 sb.append(e.getValue() + " ");
				 }
			 }
			 
				 count = 0;
		 }
		 
		 
		 return sb.toString().trim();
	 }

}
