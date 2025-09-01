class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V = adj.size();
        ArrayList<Integer> bfsResult = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[0] = true;
        queue.add(0);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfsResult.add(node);
            for (int neighbor : adj.get(node)){
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                queue.add(neighbor);
            }
        }
    }
    return bfsResult;
}
}
