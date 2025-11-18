class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        if (n == 0) return 0;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = (arr[i] > k) ? 1 : -1;
        }
        int offset = n;
        int[] minIndex = new  int[2 * n + 1];
        java.util.Arrays.fill(minIndex, n + 1);
        minIndex[0 + offset] = -1;
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += b[i];
            if (minIndex[currentSum + offset] == n + 1) {
                minIndex[currentSum + offset] = i;
            }
        }
        for (int sOffset = 1; sOffset <= 2 * n; sOffset++) {
            minIndex[sOffset] = Math.min(minIndex[sOffset], minIndex[sOffset - 1]);
        }
            currentSum = 0;
            int maxLength = 0;
            for (int i = 0; i < n; i++) {
                currentSum += b[i];
                int targetOffset = currentSum - 1 + offset;
                if (targetOffset >= 0) {
                    int start_index = minIndex[targetOffset];
                    if (start_index < n + 1) {
                        maxLength = Math.max(maxLength, i - start_index);
                    }
                }
            }
            return maxLength;
        }
    }
