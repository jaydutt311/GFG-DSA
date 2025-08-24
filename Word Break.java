class Solution {
    public boolean wordBreak(String s, String[] dictionary) {
        // code here
        Set<String> dictSet = new HashSet<>(Arrays.asList(dictionary));
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++){
            for (String word : dictSet){
                int len = word.length();
                if (i >= len && dp[i - len]){
                    if (s.substring(i - len, i).equals(word)){
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[n];
    }
}
