class Solution {
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        int n = arr.length;
        if (n < m * k) return -1;
        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        
        for (int day : arr) {
            lo = Math.min(lo, day);
            hi = Math.max(hi, day);
        }
        
        int answer = -1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if ( canMakeBouquets(arr, k, m, mid)){
                answer = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return answer;
    }
    private boolean canMakeBouquets(int[] arr, int k, int m, int day){
        int count = 0;
        int flowers = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= day){
                flowers++;
                if (flowers == k) {
                    count++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return count >= m;
    }
}
