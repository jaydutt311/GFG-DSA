/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int sumK(Node root, int k) {
        // code here
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);
        return dfs(root, 0, k, prefixSumCount);
    }
    private int dfs(Node node, int currentSum, int k, HashMap<Integer, Integer> prefixSumCount){
        if ( node == null){
            return 0;
        }
        currentSum += node.data;
        int count = prefixSumCount.getOrDefault(currentSum - k, 0);
        prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0 ) + 1);
        count += dfs(node.left, currentSum, k, prefixSumCount);
         count += dfs(node.right, currentSum, k, prefixSumCount);
         prefixSumCount.put(currentSum, prefixSumCount.get(currentSum) - 1);
         return count;
    }
}
