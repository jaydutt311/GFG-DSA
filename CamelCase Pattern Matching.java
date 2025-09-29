import java.util.*;
class Solution {
    public List<String> camelCase(String[] arr, String pat) {
        // code here
        List<String> res = new ArrayList<>();
        for (String word : arr){
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()){
                if (Character.isUpperCase(c)){
                    sb.append(c);
                }
            }
            if (sb.toString().startsWith(pat)){
                res.add(word);
            }
        }
        return res;
    }
}
