// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platforms = 1;
        int maxPlatforms = 1;
        int i = 1;
        int j = 0;
        while(i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
            }else{
                platforms--;
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }
        return maxPlatforms;
    }
}
