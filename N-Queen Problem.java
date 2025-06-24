// User function Template for Java

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
       int[] board= new int[n];
       solveNQueens(0, n, board, result);
        return result;
    }
    
    private void  solveNQueens(int col,  int n, int[] board, ArrayList<ArrayList<Integer>>result){
        if (col==n){
        result.add(buildSolution(board, n));
        return;
    }
        for (int row = 1; row <= n; row++){
            if(isValid(board, col, row)){
                board[col] = row;
                 solveNQueens(col+1,n,board,result);
            }
        }
      }
      private boolean isValid(int[] board, int col,  int row){
          for (int prevCol = 0; prevCol<col; prevCol++){
              int prevRow = board[prevCol];
              if(prevRow == row|| Math.abs(prevRow-row)==Math.abs(prevCol-col)){
                  return false;
          }
      }
      return true;
   }
   private ArrayList<Integer> buildSolution(int[] board, int n){
       ArrayList<Integer> solution = new ArrayList<>();
       for (int i = 0; i<n; i++){
           solution.add(board[i]);
       }
       return solution;
   }
}
