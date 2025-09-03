class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        int[] parent = new int[V];
        int[] rank = new int[V];
        for (int i = 0; i < V; i++){
            parent[i] = i;
            rank[i] = 0;
        }
        for (int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int pu = find(u, parent);
            int pv = find(v, parent);
            if (pu == pv) return true;
            union(pu, pv, parent, rank);
        }
        return false;
    }
    private int  find(int node, int[] parent){
        if (parent[node] != node) {
            parent[node] = find(parent[node], parent);
        }
        return parent[node];
    }
    private void union(int u, int v, int[] parent, int[] rank){
        if (rank[u] < rank[v]) {
            parent[u] = v;
        } else if (rank[v] < rank[u]) {
            parent[v] = u;
        }else {
            parent[v] = u;
            rank[u]++;
        }
    }
}
