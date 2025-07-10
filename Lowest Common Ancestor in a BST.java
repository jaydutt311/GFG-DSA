/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    Node LCA(Node root, Node n1, Node n2) {
        // your code here.
        if ( root == null ) return null;
        int val1 = n1.data;
        int val2 = n2.data;
        if ( val1 < root.data&& val2 < root.data){
            return LCA(root.left,  n1 , n2);
        }
        else if ( val1 > root.data && val2 > root.data){
            return LCA(root.right, n1, n2);
        }
        else{
            return root;
        }
    }
}
