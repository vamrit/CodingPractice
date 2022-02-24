package leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse(1534236469));

	}

	public static int reverse(int x) {
		Long response = 0L;
		while (x != 0) {
			System.out.println(x % 10);
			response = response * 10 + x % 10;
			x = x / 10;
		}
		System.out.println(response);
		if (response < Integer.MIN_VALUE || response > Integer.MAX_VALUE)
			response = 0L;
		return response.intValue();
	}
}
