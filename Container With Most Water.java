// User function Template for Java

class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        if(arr.length <= 1) return 0;
        int left = 0;
        int right = arr.length - 1;
        int max = Integer.MIN_VALUE;
        while(left <= right){
            int water = (right - left) * Math.min(arr[right],arr[left]);
            max = Math.max(max,water);
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
