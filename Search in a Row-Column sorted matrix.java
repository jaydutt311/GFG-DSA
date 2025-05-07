class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int len = mat.length;
        int bre = mat[0].length;
        int i = 0,j = bre-1;
        while(i<len && j>=0){
            if(mat[i][j]==x){
                return true;
            }else if (mat[i][j]>x){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
