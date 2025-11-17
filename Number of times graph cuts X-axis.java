// User function Template for Java
class Solution {
    public int touchedXaxis(int[] arr) {
        // code here
        int count = 0;
        int prev = 0;
        int curr = 0;
     for (int x : arr) {
         curr = prev + x;
         if ((prev > 0 && curr < 0) ||
         (prev < 0 && curr > 0) ||
         (curr == 0)) {
             count++;
         }
         prev = curr;
     }
     return count;
    }
}
