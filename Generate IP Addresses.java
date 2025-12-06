/*complete the Function*/

class Solution {
    public ArrayList<String> generateIp(String s) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) return result;
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(String s, int index, ArrayList<String> path, ArrayList<String> result) {
        if (path.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", path));
            }
            return;
        }
        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String segment = s.substring(index, index + len);
            if (segment.length() > 1 && segment.charAt(0) == '0') break;
            int num = Integer.parseInt(segment);
            if (num > 255) break;
            path.add(segment);
            backtrack(s, index + len, path, result);
            path.remove(path.size() - 1);
        }
    }
}
