// User function Template for Java
class Solution {
    public int countWays(String digits) {
        // code here
        int n = digits.length();
        if ( n == 0 || digits.charAt(0) == '0') return 0;
        int prev = 1;
        int curr = 1;
        for (int i = 1; i < n; i++){
            int temp = 0;
            if (digits.charAt(i) != '0') {
                temp += curr;
            }
            int twoDigit = Integer.parseInt(digits.substring(i - 1, i + 1));
            if ( twoDigit >= 10 && twoDigit <= 26) {
                temp += prev;
            }
            prev = curr;
            curr = temp;
            if (curr == 0) return 0;
        }
        return curr;
    }
}
