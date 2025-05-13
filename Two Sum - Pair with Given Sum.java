// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
HashSet <Integer> set = new HashSet<> ();
for(int num : arr){
    if(set.contains(target-num)){
        return true;
    }else{
        set.add(num);
        }
       }
return false;
   }
}
