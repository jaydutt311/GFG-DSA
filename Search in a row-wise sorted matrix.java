class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        for(int i = 0; i < mat.length; i++){
            if(mat[i][mat[0].length-1]==x){
                return true;
            }else if (mat[i][mat[0].length-1]>x){
                int left = 0, right = mat[0].length-1;
                while(left<=right){
                    int mid = left+(right- left)/2;
                    if(mat[i][mid]==x){
                        return true;
                    }else if (mat[i][mid]>x){
                        right = mid-1;
                    }else{
                        left = mid+1;
                    }
                }
            }
        }
        return false;
    }
}
