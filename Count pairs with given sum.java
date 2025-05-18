class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        HashMap <Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int num : arr){
            if(map.containsKey(target-num)){
                count+=map.get(target-num);
            }
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        return count;
    }
}
