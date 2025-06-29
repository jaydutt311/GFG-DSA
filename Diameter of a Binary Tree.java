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
    static int diameterRecur(Node root, int[] res) {
        // Your code here
        if (root == null){
            return 0;
        }
        int lHeight= diameterRecur(root.left, res);
        int rHeight = diameterRecur(root.right, res);
        res[0] = Math.max(res[0], lHeight+ rHeight);
        return 1 + Math.max(lHeight, rHeight);
    }
    int diameter(Node root){
        int[] res = new  int[1];
        diameterRecur(root, res);
        return res[0];
    }
}
