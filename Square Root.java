class Solution {
    int floorSqrt(int n) {
        // code here
        
        if ( n == 0 || n == 1) 
        return n;
        
        int start = 1, end = n, ans = 0;
        
        while ( start <= end) {
            int mid = start + (end - start) / 2;
            long square = ( long ) mid * mid;
            
            if ( square == n){
                return mid;
            }
        
            if ( square < n ){
                ans = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
