
class Solution {
    public ArrayList<ArrayList<String>> groupShiftedString(String[] arr) {
        // code here
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s : arr) {
            String key = getKey(s);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
   private String getKey(String s) {
       if (s.length() == 1) return "single";
       StringBuilder key = new StringBuilder();
       for (int i = 1; i < s.length(); i++) {
           int diff = s.charAt(i) - s.charAt(i - 1);
           if  (diff < 0) diff += 26;
           key.append(diff).append(",");
       }
       return key.toString();
       
   }
}
