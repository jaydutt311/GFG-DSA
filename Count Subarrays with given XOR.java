class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap <Integer,Integer> map = new HashMap<>();
        int result = 0;
        int pxr = 0;
        for(int i: arr){
            pxr ^= i;
            if(pxr == k){
                result++;
            }
            if(map.containsKey(pxr ^ k)){
                result += map.get(pxr ^ k);
            }
            map.put(pxr,map.getOrDefault(pxr,0) + 1);
        }
        return result;
    }
}
