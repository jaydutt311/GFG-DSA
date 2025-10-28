class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - 1 - i && j >= n / 2 )
                break;
                int temp = mat[i][j];
                mat [i][j] = mat[n - 1 - i][n - 1 - j];
                mat[n - 1 - i][n - 1 - j] = temp;
            }
        }
    }
}
