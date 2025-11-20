// User function Template for Java

class Solution {
    // Function to count the number of subarrays with a sum that is divisible by K
    public int subCount(int[] arr, int k) {
        // code here
        int[] freq = new int[k];
        freq[0] = 1; 
        long prefix = 0;
        long count = 0;
        for (int num : arr) {
            prefix += num;
            int rem = Math.floorMod(prefix, k);
            if (rem < 0) rem += k;
                
            count += freq[rem];
            freq[rem]++;
        }
        return (int) count;
    }
}
