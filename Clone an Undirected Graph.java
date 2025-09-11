// User function Template for Java

/*
    class Node{
        int val;
        ArrayList<Node> neighbors;
        public Node(){
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val){
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, ArrayList<Node> neighbors){
            this.val = val;
            this.neighbors = neighbors;
        }
    }
*/
class Solution {
    Node cloneGraph(Node node) {
        // code here
        if (node==null) return null;
        Map<Node, Node> cloned = new HashMap<>();
        return dfs(node, cloned);
        }
        private Node dfs(Node node, Map<Node, Node> cloned){
        if(cloned.containsKey(node)) return cloned.get(node);
        
        Node copy = new Node(node.val);
        cloned.put(node, copy);
        
        for(Node neighbor: node.neighbors){
            copy.neighbors.add(dfs(neighbor, cloned));
        }
        return copy;
            
        }
}
