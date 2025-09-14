class Solution {
    public int findMinCycle(int V, int[][] edges) {
        // code here
         List<List<int[]>>adj= new ArrayList<>();
        for(int i = 0;i<V;i++) adj.add(new ArrayList<>());
        for (int []e : edges){
            adj.get(e[0]).add(new int[]{e[1], e[2]});
            adj.get(e[1]).add(new int[]{e[0], e[2]});
        
        }
        
        int minCycle = Integer.MAX_VALUE;
        for(int [] e: edges){
            int u =e[0] , v= e[1], w=e[2];
            removeEdge(adj, u,v,w);
            int dist = dijkastra(u,v,V, adj);
            
            if(dist !=Integer.MAX_VALUE){
                minCycle= Math.min(minCycle, dist+w);
                
            }
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }    
        return minCycle==Integer.MAX_VALUE ? -1: minCycle;
    }
    private void removeEdge(List<List<int[]>>adj, int u, int v, int w){
        adj.get(u).removeIf(edge->edge[0]==v&&edge[1]==w);
          adj.get(v).removeIf(edge->edge[0]==u&&edge[1]==w);
    }
    
    private int dijkastra(int src, int dest, int V, List<List<int[]>>adj){
        int[] dist=new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;
        
        PriorityQueue<int[]> pq= new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.offer(new int[]{src, 0});
        
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int u= curr[0], d=curr[1];
            
            if(u==dest) return d;
            
            for(int[] neighbor: adj.get(u)){
                int v= neighbor[0], w= neighbor[1];
                if(dist[v]>d+w){
                    dist[v]=d+w;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }
        return Integer.MAX_VALUE;
    }
};
