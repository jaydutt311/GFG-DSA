class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int len = mat.length;
        int bre = mat[0].length;
        for(int i = 0; i <len ; i++){
            int left = 0;
            int right = bre-1;
            while(left < right){
                swap(mat,i,left,i,right);
                left++;
                right--;
            }
        }
        for(int i = 0; i < len; i++){
            for (int j = i+1;j < bre; j++){
                swap(mat,i,j,j,i);
            }
        }
    }
    static void swap(int mat[][], int row1, int col1,int row2, int col2){
        int temp = mat[row1][col1];
        mat[row1][col1] = mat[row2][col2];
        mat[row2][col2] = temp;
    }
}
