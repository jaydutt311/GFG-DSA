/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
    ArrayList<Integer> result = new ArrayList<>();
    Node current = root;
    while ( current != null){
        if ( current.left == null){
            result.add(current.data);
            current = current.right;
        }else{
            Node predecessor = current.left;
            while (predecessor.right != null && predecessor.right != current){
                predecessor = predecessor.right;
            }
            if ( predecessor.right == null){
             predecessor.right = current;
             current = current.left;
            }else{
                predecessor.right = null;
                result.add(current.data);
                current = current.right;
            }
        }
    }
    return result;
        
    }
}
