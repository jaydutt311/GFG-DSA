// User function Template for Java
class Solution {
    public int[][] generateMatrix(int[] rowSum, int[] colSum) {
        // code here
       int n = rowSum.length;
       int m = colSum.length;
       int[][] matrix = new int[n][m];
       int i = 0, j = 0;
       while (i < n && j < m) {
           int  val = Math.min(rowSum[i], colSum[j]);
           matrix[i][j] = val;
           rowSum[i] -= val;
           colSum[j] -= val;
           if (rowSum[i] == 0) i++;
           if (colSum[j] == 0) j++;
       }
       return matrix;
    }
}
