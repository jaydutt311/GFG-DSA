class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int total = 0;
        for (int num : arr){
            total += num;
        }
        if (total % 2 != 0) return false;
        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : arr) {
            for ( int j = target; j >= num; j--){
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[target];
    }
}
