import java.util.*;
class Solution {
    public int closest3Sum(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int closestSum = Integer.MAX_VALUE / 2;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n -1;
            while (left < right ) {
                int sum = arr[i] + arr[left] + arr[right];
                if (Math.abs(target - sum) < Math.abs(target - closestSum) ||
                (Math.abs(target - sum) == Math.abs(target - closestSum) && sum > closestSum)) {
                    closestSum = sum;
                }
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }
};
