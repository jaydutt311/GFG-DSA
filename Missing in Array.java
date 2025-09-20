class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;
        long totalSum =(long) n * (n + 1) / 2;
        long arrSum = 0;
        for (int num : arr){
            arrSum += num;
        }
        return (int)(totalSum - arrSum);
    }
}
