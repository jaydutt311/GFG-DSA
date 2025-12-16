/*
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
import java.util.*;
class Solution {
    void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    Node buildBalancedBST(ArrayList<Integer> list, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Node root = new Node(list.get(mid));
        root.left = buildBalancedBST(list, start, mid - 1);
        root.right = buildBalancedBST(list, mid + 1, end);
        return root;
    }
    Node balanceBST(Node root) {
        // Add your code here.
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return buildBalancedBST(list, 0, list.size() - 1);
    }
}
