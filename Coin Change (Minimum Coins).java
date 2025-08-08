class Solution {

    public int minCoins(int coins[], int sum) {
        // code here
        int[] dp = new int[sum + 1];
        int INF = Integer.MAX_VALUE - 1;
        for (int i = 1; i <= sum; i++){
            dp[i] = INF;
        }
        dp[0] = 0;
        for (int coin : coins){
            for (int i = coin; i <= sum; i++){
                if (dp[i - coin] != INF){
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[sum] == INF ? -1 : dp[sum];
    }
}
