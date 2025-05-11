class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        
        int len = mat.length, bre = mat[0].length;
        int top= 0 , bottom = len-1;
        int row = -1;
        while(top<=bottom){
            int mid = top + ( bottom-top)/2;
            if(mat[mid][bre-1]==x){
                return true;
            }else if ( mat[mid][bre-1]>x){
                bottom = mid - 1;
                row = mid;
            }else{
                top = top +1;
            }
        }
        if(row < 0){
            return false;
        }
        int left = 0,  right = bre-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(mat[row][mid]==x){
                return true;
        }else if (mat[row][mid]>x){
        right = mid - 1;
        }else{
            left = mid + 1;
        }
    }
    return false ;
  }
}
