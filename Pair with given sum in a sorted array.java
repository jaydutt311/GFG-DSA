// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int count = 0;
        int left = 0;
        int  right = arr.length - 1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                if(arr[left]==arr[right]){
                    int n = right - left + 1 ;
                    count += (n*(n-1))/2;
                    break;
                }
                int leftcount = 0, leftval = arr[left];
                while(left <= right && arr[left] == leftval){
                    leftcount++;
                    left--;
                }
                int rightcount = 0, rightval = arr[right];
                while(left <= right && arr[right] == rightval){
                    rightcount++;
                    right--;
                }
                count += leftcount * rightcount;
            }else if(sum <target){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}
