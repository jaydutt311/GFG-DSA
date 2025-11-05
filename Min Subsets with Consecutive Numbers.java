// User function Template for Java
import java.util.*;
class Solution {
    public int numOfSubset(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1){
                count++;
            }
        }
        return count;
    }
}
