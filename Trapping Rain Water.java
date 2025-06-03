class Solution {
    public int maxWater(int arr[]) {
        // code here
        int left = 1;
        int right = arr.length - 2;
        int lmax= arr[0];
        int rmax = arr[arr.length - 1];
        int count = 0;
        while(left <= right){
            if(lmax <= rmax){
                count += Math.max(0, lmax - arr[left]);
                lmax = Math.max(lmax, arr[left]);
                left++;
            }else{
                count += Math.max(0,rmax - arr[right]);
                rmax = Math.max(rmax, arr[right]);
                right--;
            }
        }
        return count;
    }
}
