// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        if(s.length() == 0 || s.length() == 1) return s.length();
        boolean [] vis = new boolean[26];
        int res = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            while(vis[s.charAt(right) - 'a' ] == true){
                vis[s.charAt(left) - 'a' ] = false;
                left++;
            }
            vis[s.charAt(right) - 'a'] = true;
            res = Math.max(res,(right-left + 1));
        }
        return res;
    }
}
