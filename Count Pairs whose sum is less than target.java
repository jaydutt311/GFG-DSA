// User function Template for Java
class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while(left < right ){
            if(arr[left]+ arr[right] >= target){
                right --;
            }else{
                count += right - left;
                left++;
              }
            }
            return count ;
        }
    }
