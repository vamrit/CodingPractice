package leetcode;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(2,3);

	}

	public static int divide(int dividend, int divisor) {
        int sign = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0) ? -1 : 1;
		
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
        if (divisor == 0 || (dividend == Integer.MIN_VALUE  && divisor == -1) || (dividend == Integer.MAX_VALUE  && divisor == 1))
			return Integer.MAX_VALUE;
		
        if (dividend == 0 ||(dividend == Integer.MAX_VALUE  && divisor == -1) || (dividend == Integer.MIN_VALUE  && divisor == 1))
        	return dividend * sign;
		
		
		
		int response = 1;
		int n = divisor;
		while (dividend >= n) {
			n = n * divisor;
			response = response + 1;
		}
		
		return response * sign;
		
	}

}
