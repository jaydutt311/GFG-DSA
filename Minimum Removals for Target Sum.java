class Solution {
    public int minRemovals(int[] arr, int k) {
        // code here
        int n = arr.length;
        long totalSum = 0;
        for (int x : arr) totalSum += x; 
        if (totalSum < k) return -1;
        long target = totalSum - k; 
        if (target == 0) return n;
        int left = 0;
        long currSum = 0;
        int maxLen = -1;
        for (int right  = 0; right < n; right++) {
            currSum += arr[right];
            while (currSum > target && left <= right ) {
                currSum -= arr[left];
                left++;
            }
            if (currSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        if (maxLen == -1) return -1;
        return n - maxLen;
    }
}
