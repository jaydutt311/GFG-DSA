class Solution {
    public int longestStringChain(String words[]) {
        // code here
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<String, Integer> dp = new HashMap<>();
        int maxChain = 1;
        for (String word : words) {
            int best = 1;
            for(int i = 0; i < word.length(); i++){
                String prev = word.substring(0, i) + word.substring(i + 1);
                int len = dp.getOrDefault(prev, 0) + 1;
                best = Math.max(best, len);
            }
            dp.put(word, best);
            maxChain = Math.max(maxChain, best);
        }
        return maxChain;
    }
}
