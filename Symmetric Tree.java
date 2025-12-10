/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        // code here
     if (root == null) return true;
     return isMirror(root.left, root.right);
    }
    private boolean isMirror(Node left, Node right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.data != right.data)
        return false;
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
