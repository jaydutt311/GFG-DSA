// User function Template for Java
class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        long totalSum = 0;
        for (int num : arr){
            totalSum += num;
        }
        if (totalSum % 3 != 0){
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        long partSum = totalSum / 3;
        long prefixSum = 0;
        int firstIndex = -1,  secondIndex = -1;
        for (int i = 0; i < n; i++){
            prefixSum += arr[i];
            if (prefixSum == partSum && firstIndex == -1){
                firstIndex = i;
            } else if (prefixSum == 2 * partSum && firstIndex != -1){
                secondIndex = i;
                break;
            }
        }
        if (firstIndex != -1 && secondIndex != -1 && secondIndex < n -1 ){
            ans.add(firstIndex);
            ans.add(secondIndex);
        }else {
            ans.add(-1);
            ans.add(-1);
        }
        return ans;
    }
}
