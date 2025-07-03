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
    ArrayList<Integer> boundaryTraversal (Node node) {
        // code here
      ArrayList<Integer> res = new ArrayList<>();
      if ( node == null ){
          return res;
      }
      if (!isLeaf(node)){
          res.add(node.data);
      }
      addLeftBoundary(node.left, res);
      addLeaves(node, res);
      addRightBoundary(node.right, res);
      return res;
    }
    private boolean isLeaf(Node node){
        return node.left == null && node.right == null ;
    }
    private void addLeftBoundary(Node node, ArrayList<Integer> res){
        while ( node != null){
            if (!isLeaf(node)){
                res.add(node.data);
            }
            if ( node.left != null){
                node = node.left;
            }
            else{
                node =  node.right;
            }
        }
    }
    private void addLeaves(Node node, ArrayList<Integer> res){
        if (node == null){
            return;
        }
        if(isLeaf(node)){
            res.add(node.data);
            return;
        }
        addLeaves(node.left, res);
        addLeaves(node.right, res);
    }
    private void addRightBoundary(Node node, ArrayList<Integer> res){
        Stack<Integer> temp = new Stack<>();
        while ( node != null){
            if (!isLeaf(node)){
                temp.push(node.data);
            }
            if(node.right != null){
                node = node.right;
            }
            else{
                node = node.left;
            }
        }
        while (!temp.isEmpty()){
            res.add(temp.pop());
        }
    }
}
