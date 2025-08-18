class Solution {
    int maxValue(int[] arr) {
        // code here
        int  n = arr.length;
        if (n == 1) return arr[0];
        if (n == 2) return Math.max(arr[0], arr[1]);
        return Math.max(robLinear(arr, 0, n - 2), robLinear(arr, 1, n - 1));
    }
    private int robLinear(int[] arr, int start, int end){
        int prev1 = 0;
        int prev2 = 0;
        for (int i = start; i <= end; i++){
            int pick = arr[i] + prev2;
            int skip = prev1;
            int curr = Math.max(pick, skip);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
