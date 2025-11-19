import java.util.*;

class Solution {
    public static int zeroSumSubmat(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int maxArea = 0;
        
        for (int left = 0; left < m; left++) {
            long[] temp = new long[n];
            for (int right = left; right < m; right++) {
                for (int i = 0; i < n; i++) {
                    temp[i] += mat[i][right]; 
                }
                maxArea = Math.max(maxArea, largestZeroSumSubarrayArea(temp, right - left + 1));
            }
        }
        return maxArea;
    }
    private static int largestZeroSumSubarrayArea(long[] arr, int width) {
      HashMap<Long, Integer> map = new HashMap<>();
      map.put(0L, -1);
        long prefix = 0;
        int maxHeight = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            if (map.containsKey(prefix)) {
                int height = i - map.get(prefix);
                maxHeight = Math.max(maxHeight, height);
            } else {
                map.put(prefix, i);
            }
        }
        return maxHeight * width;
    }
}
