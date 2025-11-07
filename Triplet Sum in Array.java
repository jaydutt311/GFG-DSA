import java.util.Arrays;
class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return false;
    }
}
