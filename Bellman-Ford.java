// User function Template for Java

class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int INF = 100000000;
        int[] dist= new int[V];
        java.util.Arrays.fill(dist, INF);
        dist[src]=0;
        
        for(int i = 0; i<V-1; i++){
            for(int[] edge: edges){
                int u= edge[0];
                int v= edge[1];
                int w= edge[2];
                
                if(dist[u] != INF && dist[u]+w< dist[v]){
                    dist[v]= dist[u]+w;
                }
            }
        }
        for (int[] edge: edges){
            int u= edge[0];
            int v= edge[1];
            int w= edge[2];
            
            if(dist[u] != INF && dist[u]+w< dist[v]){
                return new int[] {-1};
            }
        }
        return dist;
    }
}
