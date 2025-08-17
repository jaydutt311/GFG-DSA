class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];
        int incl = arr[0];
        int excl = 0;
        for (int i = 1; i < arr.length; i++){
            int newIncl = excl + arr[i];
            int newExcl = Math.max(incl, excl);
            incl = newIncl;
            excl = newExcl;
        }
        return Math.max(incl, excl);
    }
}
