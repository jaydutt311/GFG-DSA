class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        int originalColor = image[sr][sc];
        if(originalColor==newColor) return image;
       
        int rows = image.length;
        int cols = image[0].length;
        
        dfs(image, sr, sc, originalColor, newColor, rows, cols);
        return image;
        
    }
    
     private void dfs(int [][] image, int r, int c, int originalColor, int newColor, int rows, int cols){
         if(r<0|| r>= rows || c<0 || c>= cols || image[r][c] != originalColor) return;
         
         image[r][c] = newColor;
         
         dfs(image, r+1, c, originalColor, newColor, rows, cols);
         dfs(image, r-1, c, originalColor, newColor, rows, cols);
          dfs(image, r, c+1, originalColor, newColor, rows, cols);
          dfs(image, r, c-1, originalColor, newColor, rows, cols);
         
     }
}
