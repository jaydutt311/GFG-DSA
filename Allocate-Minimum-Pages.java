//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        if (k > arr.length ) return -1;
        int low = 0 , high = 0;
        for (int p : arr){
            low = Math.max(low,p);
            high += p;
        }
        while (low < high) {
            int mid = (low + high) / 2;
            if(canAllocate(arr, k, mid))
            high = mid;
            else 
            low = mid + 1;
        }
        return low;
    }
    static boolean canAllocate(int[] arr, int k, int maxPages) {
        int students = 1, sum =0;
        for (int p : arr) {
            if (( sum += p) > maxPages) {
                students++;
                sum = p;
            }
        }
        return students <= k;
    }
}
