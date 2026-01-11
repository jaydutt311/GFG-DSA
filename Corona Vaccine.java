/*
class Node{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    static int vaccines;
    static int dfs(Node root) {
        if (root == null)
        return 2;
         int left = dfs(root.left);
            int right = dfs(root.right);
            if (left == 0 || right == 0) {
                vaccines++;
                return 1;
            }
            if (left == 1 || right == 1) {
                return 2;
            }
            return 0;
    }
    
    public static int supplyVaccine(Node root) {
        // Your code here
        vaccines = 0;
        if (dfs(root) == 0)
        vaccines++;
        return vaccines;
    }
}
