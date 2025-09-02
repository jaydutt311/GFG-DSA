class Solution {
    public int orangesRotting(int[][] mat) {
        // Code here
        int n = mat.length;
        int m = mat[0].length;
        int fresh = 0;
        Queue<int[]> q =  new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int i = 0; i < n; i++){
           for (int j = 0; j < m; j++){
               if (mat[i][j] == 2){
                   q.offer(new int[]{i, j, 0});
               }else if (mat[i][j] == 1){
                   fresh++;
               }
           } 
        }
        int time = 0;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0], y = curr[1], t = curr[2];
            time = Math.max(time, t);
            for (int k = 0; k < 4; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && mat[nx][ny] == 1){
                    mat[nx][ny] = 2;
                    fresh--;
                    q.offer(new int[]{nx, ny, t + 1});
                }
            }
        }
        return fresh == 0 ? time : -1;
    }
}
