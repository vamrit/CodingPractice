package leetcode;

/**
 * @author Vijay Amrit
 * @date 3/23/22
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 */
public class LongestCommonPrefix {

    private String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0) return "";
        String response = strs[0];
//        System.out.println(response.length());
        for (int i = 1; i < n; i++) {
        	
            while (strs[i].indexOf(response) != 0) {
            	response = response.substring(0, response.length() - 1);
//            	System.out.println(response);
                if (response.isEmpty()) return "";
            }
        }
        return response;
    }

    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strings));
    }
}
