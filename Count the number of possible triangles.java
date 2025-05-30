// User function Template for Java

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        int n = arr.length;
        for(int i = n - 1; i >= 2; i--){
            int left = 0;
            int right = i-1;
            while(left<right){
                int sum = arr[left] + arr[right];
                if(sum > arr[i]){
                    count+= right-left;
                    right--;
                }else{
                    left++;
                }
            }
        }
        return count;
    }
}
