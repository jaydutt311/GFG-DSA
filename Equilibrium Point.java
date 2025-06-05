class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int arrSum = 0;
         for(int i: arr){
             arrSum += i;
         }
         int prefixSum = 0;
         for(int i = 0; i < arr.length; i++){
             if((arrSum - prefixSum - arr[i]) == prefixSum){
                 return i;
             }
             prefixSum += arr[i];
         }
         return -1;
    }
}
