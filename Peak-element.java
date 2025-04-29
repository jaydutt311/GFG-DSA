class Solution {

    public int peakElement(int[] arr) {
        // code here
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + ( high - low ) / 2;
            boolean leftCheck = ( mid == 0) || ( arr[mid] > arr[mid - 1]);
            boolean rightCheck = ( mid == arr.length - 1) || ( arr[mid] > arr[mid + 1]);
            if(leftCheck && rightCheck) {
                return mid;
            }
            else if( mid > 0  && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
