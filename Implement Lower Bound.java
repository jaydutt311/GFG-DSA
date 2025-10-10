class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int low = 0;
        int high = arr.length;
        while (low < high){
            int mid = low + (high - low) / 2;
            if (arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}
