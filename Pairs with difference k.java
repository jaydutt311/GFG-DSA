// User function Template for Java
class Solution {
    int countPairs(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : arr){
            if (map.containsKey(num - k))
            count += map.get(num - k);
            if (map.containsKey(num + k))
            count += map.get(num + k);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
           return count;
     }
  }
