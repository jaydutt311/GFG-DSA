
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int left = 0;
         int sum = 0;
         ArrayList<Integer> result = new ArrayList<>();
         for(int i = 0; i < arr.length; i++){
             sum += arr[i];
             while(sum > target && left < i){
                 sum-= arr[left];
                 left++;
             }
             if(sum == target){
                 result.add(left+1);
                 result.add(i+1);
                 return result;
             }
         }
         result.add(-1);
         return result;
    }
}
