// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    // Return the Kth smallest element in the given BST
    int count = 0;
    int result = -1;
    public int kthSmallest(Node root, int k) {
        // Write your code here
        inOrder(root, k);
        return result;
    }
    private void inOrder(Node node, int k){
        if (node == null){
            return;
        }
        inOrder(node.left, k);
        count++;
        if (count == k){
            result = node.data;
            return;
        }
        inOrder(node.right, k);
    }
}
