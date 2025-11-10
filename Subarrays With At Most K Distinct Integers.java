import java.util.*;
class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        int n = arr.length;
        int left = 0;
        int result = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int right = 0; right < n; right++) {
            freq.put(arr[right], freq.getOrDefault(arr[right], 0) + 1);
            
            while (freq.size() > k) {
                freq.put(arr[left], freq.get(arr[left]) - 1);
                if (freq.get(arr[left]) == 0)
                freq.remove(arr[left]);
                left++;
            }
            result += (right - left + 1);
        }
        return result;
    }

}
