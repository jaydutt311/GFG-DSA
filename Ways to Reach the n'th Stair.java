class Solution {
    int countWays(int n) {
        // your code here
        if (n == 1) return 1;
        if (n == 2) return 2;
        int prev2 = 1;
        int prev1 = 2;
        int current = 0;
        for ( int i = 3; i <= n; i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}
