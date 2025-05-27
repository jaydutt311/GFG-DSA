class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
       int count = 0;
       int n = arr.length;
       for(int i = 0; i  <n;i++){
           int j=i+1,k=n-1;
           while(j < k){
               int sum = arr[i] + arr[j] +arr[k];
               if(sum == target){
                   count++;
                   int temp = j+1;
                   while (temp<k && arr[temp] == arr[j]){
                       count++;
                       temp++;
                   }
                   k--;
               }
               else if(sum < target)
               j++;
               else if (sum>target)
               k--;
           }
       }
       return count;
    }
}
