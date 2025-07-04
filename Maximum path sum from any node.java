/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    // Function to return maximum path sum from any node in a tree.
        // your code goes here
    int res = Integer.MIN_VALUE;
    int findMaxSum(Node node){
        sum(node);
        return res;
    }
    private int sum (Node node){
        if (node == null){
            return 0;
        }
        int left = Math.max(0, sum(node.left));
        int right = Math.max(0, sum(node.right));
        int currentMax = left + right + node.data;
        res = Math.max(res, currentMax);
        return node.data + Math.max(left, right);
    }
}
