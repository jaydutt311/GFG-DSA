// User function Template for Java

import java.util.*;

class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        Arrays.sort(arr);
        
        int moves =  0;
        
        for (int i = 1; i < arr.length; i++){
            if (arr[i] <= arr[i - 1]){
                int required = arr[i - 1]+ 1;
                moves += required - arr[i];
                arr[i] = required;
            }
        }
        
        return moves;
    }
}
