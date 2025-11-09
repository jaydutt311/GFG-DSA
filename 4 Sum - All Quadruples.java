import java.util.*;
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
           ArrayList<ArrayList<Integer>> res = new ArrayList<>();
           int  n = arr.length;
           
           Arrays.sort(arr);
           
           for (int i = 0; i < n - 3; i++) {
               if (i > 0 && arr[i]  == arr[i - 1]) continue;
               
               for (int j = i + 1; j < n - 2; j++) {
                   if (j > i + 1 &&  arr[j] == arr[j - 1]) continue;
                   
                   int left = j + 1;
                   int right = n - 1;
                   
                   while (left < right ) {
                       long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];
                       
                       if (sum == target) {
                           ArrayList<Integer> quad = new ArrayList<>();
                           quad.add(arr[i]);
                           quad.add(arr[j]);
                           quad.add(arr[left]);
                           quad.add(arr[right]);
                           res.add(quad);
                           
                           left++;
                           right--;
                           
                           while (left < right && arr[left] == arr[left - 1]) left++;
                           while (left < right && arr[right] == arr[right + 1]) right--;
                       }else if (sum < target) {
                           left++;
                       }else {
                           right--;
                        }
                    }
                } 
            }
    return res;
    }
}
