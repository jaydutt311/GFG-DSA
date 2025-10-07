import java.util.*;
class Solution {
    public String findLargest(int[] arr) {
        // code here
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++){
            strArr[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(strArr, new Comparator<String>(){
        public int compare(String a, String b){
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab);
        }
    });
    if (strArr[0].equals("0")){
        return "0";
    }
    StringBuilder result = new StringBuilder();
    for (String num : strArr){
        result.append(num);
    }
    return result.toString();
   }
}
