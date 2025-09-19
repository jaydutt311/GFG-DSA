// User function Template for Java
class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        int n = arr.length;
        long expectedSum = (long)(n - 1) * n /  2;
        long actualSum = 0; 
        for (int num : arr){
            actualSum += num;
        }
        return (int)(actualSum - expectedSum);
    }
}
