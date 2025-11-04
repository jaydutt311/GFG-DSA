import java.util.*;

class Solution {
    public int countSum(int arr[], int target) {
        // code here
        int n = arr.length;
        int count = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int currSum = arr[i] + arr[j];
                
                int complement = target - currSum;
                
                if (map.containsKey(complement)) {
                    count += map.get(complement);
                }
            }
            for (int k = 0; k < i; k++) {
                int pairSum = arr[k] + arr[i];
                map.put(pairSum, map.getOrDefault(pairSum, 0) + 1);
            }
        }
        return count;
    }
}
