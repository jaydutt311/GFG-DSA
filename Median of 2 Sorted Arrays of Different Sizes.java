class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        int n = a.length;
        int m = b.length;
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;
        
        while (i < n && j < m){
            if(a[i] <= b[j]){
                merged[k++] = a[i++];
            
            }else{
                merged[k++] = b[j++];
            }
        }
        while (i < n){
            merged[k++] = a[i++];
        }
        while (j < m ){
            merged[k++] = b[j++];
        }
        int total = n + m;
        if (total % 2 == 1){
            return merged[total / 2];
        }else {
            int mid1 = total / 2;
            int mid2 = mid1 - 1;
            return (merged[mid1] + merged[mid2]) / 2.0;
        }
    }
}
