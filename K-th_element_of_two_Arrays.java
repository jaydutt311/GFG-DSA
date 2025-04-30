class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
     int n = a.length;
     int m = b.length;
     if(n > m) {
         return kthElement(b, a, k);
     }
     int low = Math.max(0, k - m);
     int high = Math.min(k, n);
     while(low <= high) {
         int cut1 = (low + high) / 2;
         int cut2 = k - cut1;
        int l1 = (cut1 == 0) ? Integer.MIN_VALUE : a[cut1 - 1];
        int l2 = (cut2 == 0) ? Integer.MIN_VALUE : b[cut2 - 1];
        int r1 = (cut1 == n) ? Integer.MAX_VALUE : a[cut1];
        int r2 = (cut2 == m) ? Integer.MAX_VALUE : b[cut2];
        
        if (l1 <= r2 && l2 <= r1) {
            return Math.max(l1, l2);
        }
        else if (l1 > r2) {
            high = cut1 -1;
        }else {
            low = cut1 +1;
        }
        }
        return -1;
        
 }
}
