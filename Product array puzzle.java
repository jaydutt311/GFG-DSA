// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int zeroCount = 0, zeroIndex = -1, product = 1;
        
        int length = arr .length; 
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
                zeroIndex = i;
            }else{
                product *= arr[i];
            }
        }
        int[] result = new int[length];
        Arrays.fill(result, 0);
        if(zeroCount == 0){
            for ( int i = 0 ; i < length; i++){
                result[i] = product / arr[i];
            }
        }else if ( zeroCount == 1){
            result[zeroIndex] = product;
        }
        return result;
    }
}
