/*Complete the given function
Node is as follows:
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if ( root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            if(current == null){
                result.add( -1);
            }else{
                result.add(current.data);
                queue.offer(current.left);
                queue.offer(current.right);
            }
        }
        return result;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        
        // code here
        if (arr==null||arr.size()==0||arr.get(0)==-1)return null;
        Node root = new Node( arr.get(0));
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(!queue.isEmpty() && i<arr.size()){
            Node current = queue.poll();
            if(arr.get(i) != -1){
                current.left = new Node ( arr.get(i));
                queue.add(current.left);
            }
            i++;
            if (i<arr.size() && arr.get(i) != -1){
                current.right = new Node ( arr.get(i));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }
};
