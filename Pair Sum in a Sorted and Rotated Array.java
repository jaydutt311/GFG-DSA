
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        int n = arr.length;
        int pivot = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1 ]) {
                pivot = i + 1;
                break;
            }
        }
        if (pivot == -1) pivot = 0;
        int left = pivot;
        int right = (pivot - 1 + n) % n;
        while (left != right ){
            int sum = arr[left] + arr[right];
            if (sum == target) 
            return true;
            if (sum < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }
        return false;
    }
}
