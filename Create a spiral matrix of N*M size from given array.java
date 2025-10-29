// User function Template for Java

class Solution {
    public int[][] spiralFill(int n, int m, int[] arr) {
        // code here
        int[][] mat = new int[n][m];
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        int idx = 0;
        int total = n * m;
        
        while (idx < total ) {
            for (int j = left; j <= right && idx < total; j++) {
                mat[top][j] = arr[idx++];
            }
            top++;
            for (int i = top; i <= bottom && idx < total; i++) {
                mat[i][right] = arr[idx++];
            }
        right--;
        
        for(int j = right; j >= left && idx < total; j--) {
            mat[bottom][j] = arr[idx++];
        }
        bottom--;
        
        for (int i = bottom; i >= top && idx < total; i--) {
            mat[i][left] = arr[idx++];
        }
        left++;
    }
    
    return mat;
    }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     int[] arr = new int[n * m];
     for ( int i = 0; i < n * m; i++)  arr[i] = sc.nextInt();
 
     Solution sol = new Solution();
     int[][] res = sol.spiralFill(n, m, arr);
     
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
             System.out.print(res[i][j]);
             if (j < m - 1) System.out.print(" ");
             
         }
         System.out.println();
     }
     sc.close();
    }
 }
 
