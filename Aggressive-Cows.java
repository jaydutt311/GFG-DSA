
// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int result = 0 ;
        while (low <= high ) {
            int mid = low + ( high - low) / 2;
            if (canPlaceCows(stalls, k , mid)) {
                result = mid;
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return result;
    }
    private static boolean canPlaceCows(int[] stalls, int k, int dist) {
        int  count = 1;
        int lastPos = stalls[0];
        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];
            }
        }
        return count >= k;
    }
}
