class Solution {
    public int countPS(String s) {
        // code here
        int n = s.length();
        int count = 0;
        for (int center = 0; center < n; center++){
            count += countPalindromesAroundCenter(s, center, center);
             count += countPalindromesAroundCenter(s, center, center + 1);
        }
        return count;
    }
    private int countPalindromesAroundCenter(String s, int left, int right){
        int cnt = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if (right - left + 1 >= 2){
                cnt++;
            }
            left--;
            right++;
        }
        return cnt;
    }
}
