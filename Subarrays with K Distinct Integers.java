// User function Template for Java
import java.util.*;
class Solution {
    static int exactlyK(int arr[], int k) {
        // code here
        return atMostK(arr, k) - atMostK(arr, k -1);
    }
    static int atMostK(int arr[], int k) {
        int n = arr.length;
        int left = 0, res = 0;
        Map<Integer, Integer > map = new HashMap<>();
        for (int right = 0; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            res += (right - left + 1);
        }
        return res;
    }
}
