// User function Template for Java
class Solution {
    static int countWays(String s) {
        // code here
        int n = s.length();
        Integer[][][] dp = new Integer[n][n][2];
        return solve(s, 0, n - 1, 1, dp);
    }
    private static int solve(String s, int i, int j, int isTrue, Integer[][][] dp){
        if (i > j) return 0;
        if (i == j){
            if (isTrue == 1){
             return s.charAt(i) == 'T' ? 1 : 0;
        }else {
            return s.charAt(i) == 'F' ? 1 : 0;
        }
    }
    if (dp[i][j][isTrue] != null ){
        return dp[i][j][isTrue];
    }
    int ways = 0;
    for (int k = i + 1; k < j; k += 2){
        char op = s.charAt(k);
        int leftTrue = solve(s, i, k - 1, 1, dp);
         int leftFalse = solve(s, i, k - 1, 0, dp);
         int rightTrue = solve(s, k + 1, j, 1, dp);
         int rightFalse = solve(s, k + 1, j, 0, dp);
         if (op == '&'){
             if (isTrue == 1 ){
                ways += leftTrue *  rightTrue;
             }else{
                 ways += leftTrue * rightFalse + leftFalse * rightTrue + leftFalse * rightFalse;
             }
         }
         else if (op == '|'){
             if (isTrue == 1){
                 ways += leftTrue * rightTrue + leftTrue * rightFalse + leftFalse * rightTrue;
             }else {
                 ways += leftFalse * rightFalse;
             }
         }
         else if (op == '^'){
             if (isTrue ==  1){
             ways += leftTrue * rightFalse + leftFalse * rightTrue;
         }else{
             ways += leftTrue * rightTrue + leftFalse * rightFalse;
         }
    }
}
dp[i][j][isTrue] = ways;
return ways;
}
}
