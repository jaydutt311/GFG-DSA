// User function Template for Java

class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        // Complete the function
        int[] first = new int[k];
        java.util.Arrays.fill(first, -2);
        first[0] = -1;
        long prefix = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int rem = (int)(prefix % k);
            if (rem < 0) rem += k;
            if (first[rem] != -2 ) {
                int len = i - first[rem];
                if (len > maxLen) maxLen = len; {
                }
            } else {
                first[rem] = i;
            }
        }
        return maxLen;
    }
}
