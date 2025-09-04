class Solution {
   
        private int n, m;
        private boolean[][] visited;
        private int[] dx = {-1, -1, -1, 0,0, 1, 1, 1};
        private int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
         public int countIslands(char[][] grid) {
        // Code here
        if (grid == null || grid.length == 0) return 0;
        n = grid.length;
        m = grid[0].length;
        visited = new boolean[n][m];
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (grid[i][j] == 'L' && !visited[i][j]){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int x, int  y){
        visited[x][y] = true;
        for (int dir = 0; dir < 8; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (isSafe(grid, nx, ny)){
                dfs(grid, nx, ny);
            }
        }
    }
    private boolean isSafe(char[][] grid, int x, int y){
        return x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == 'L' && !visited[x][y];
    }
}
