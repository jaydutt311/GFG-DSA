// User function Template for Java
class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        int result = 0;
        int prefixSum = 0;
        HashMap <Integer , Integer > map = new HashMap<>();
        map.put(0,1);
        for(int i:arr){
            prefixSum += i;
            result += map.getOrDefault(prefixSum - k,0);
            map.put(prefixSum,map.getOrDefault(prefixSum,0) + 1);
        }
        return result;
    }
}
