class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>>  adj = new ArrayList<>();
        for ( int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
        }
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++){
            if (!visited[i]){
                if (dfs(i, adj, visited, recStack)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int node, List<List<Integer>> adj, boolean[] visited, boolean[] recStack){
        visited[node] = true;
        recStack[node] = true;
        for (int neighbor : adj.get(node)){
            if (!visited[neighbor]){
                if (dfs(neighbor, adj, visited, recStack)){
                    return true;
                }
            }else if (recStack[neighbor]){
                return true;
            }
        }
        recStack[node] = false;
        return false;
    }
}
