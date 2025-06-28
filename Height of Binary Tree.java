/*
class Node
{
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
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if (node == null){
            return 0;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    int depth = 0;
    while (!q.isEmpty()) {
        int levelSize = q.size();
        for (int i = 0; i < levelSize; i++) {
            Node curr = q.poll();
            if (curr.left != null){
              q.add(curr.left);
            }
            if (curr.right != null){
                q.add(curr.right);
            }
        }
        depth++;
    }
    return depth - 1;
}
}
