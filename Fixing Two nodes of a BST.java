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
    Node first, middle, last, prev;
    void correctBST(Node root) {
        // code here.
        first = middle = last = prev = null;
        inorder(root);
        if (first != null&& last != null){
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
        }else if (first != null&& middle != null){
            int temp = first.data;
            first.data = middle.data;
            middle.data = temp;
        }
    }
    private void inorder(Node root ){
        if ( root == null){
            return ;
        }
        inorder(root.left);
        if ( prev != null && prev.data > root.data){
            if (first == null){
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }
        prev = root;
        inorder(root.right);
    }
}
