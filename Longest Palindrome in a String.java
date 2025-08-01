
class Solution {
    static String longestPalindrome(String s) {
        // code here
        if (s == null || s.length() < 1) return "";
        int maxLen = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++){
            int[] odd = expandAroundCenter(s, i, i);
            int[] even = expandAroundCenter(s, i, i + 1);
            if (odd[1] - odd[0] + 1 > maxLen){
                maxLen = odd[1] - odd[0] + 1;
                start = odd[0];
            }
            else if (odd[1] - odd[0] + 1 == maxLen && odd[0] < start) {
                start = odd[0];
            }
            if (even[1] - even[0] + 1 > maxLen){
                maxLen = even[1] -even[0] + 1;
                start = even[0];
            }
            else if (even[1] - even[0] + 1 == maxLen && even[0] < start){
                start = even[0];
            }
        }
        return s.substring(start, start + maxLen);
    }
    static int[] expandAroundCenter(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return new int[]{left + 1, right - 1};
        }
}
