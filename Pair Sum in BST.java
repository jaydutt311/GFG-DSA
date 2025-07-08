/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        HashSet<Integer> set = new HashSet<>();
        return dfs(root, target, set);
    }
    private boolean dfs(Node node, int target, HashSet<Integer> set){
        if (node == null ){
            return false;
        }
        if (set.contains(target - node.data)){
            return true;
        }
        set.add(node.data);
        return dfs(node.left, target, set) || dfs(node.right, target, set);
    }
}
