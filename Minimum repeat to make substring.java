class Solution {
    public int minRepeats(String s1, String s2) {
        // code here
        int count = 1;
        StringBuilder repeated = new StringBuilder(s1);
        
        while (repeated.length() < s2.length()){
            repeated.append(s1);
            count++;
        }
        if (kmpSearch(repeated.toString(), s2)){
            return count;
        }
        repeated.append(s1);
        count++;
        if (kmpSearch(repeated.toString(), s2)){
            return count;
        }
        return -1;
    }
    private boolean kmpSearch(String text, String pattern){
        int[] lps = buildLPS(pattern);
        int i = 0, j = 0;
        while (i < text.length()){
            if (text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
                if(j == pattern.length()){
                    return true;
                }
            }else {
                if (j != 0){
                    j = lps[j -1];
                }else{
                    i++;
                }
            }
        }
        return false;
    }
    private int[] buildLPS(String pattern){
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;
        while (i < pattern.length()){
            if (pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if (len != 0 ){
                    len = lps[len - 1 ];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
};
