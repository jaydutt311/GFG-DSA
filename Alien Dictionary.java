class Solution {
    public String findOrder(String[] words) {
        // code here
        Map<Character, List<Character>> graph = new HashMap<>();
        Map<Character, Integer> inDegree= new HashMap<>();
        
        for(String word: words){
            for(char c : word.toCharArray()){
                graph.putIfAbsent(c, new ArrayList<>());
                inDegree.putIfAbsent(c,0);
            }
        }
        for(int i=0; i<words.length-1;i++){
            String w1 = words[i];
            String w2 = words[i+1];
            int minLen = Math.min(w1.length(), w2.length());
            
            boolean foundOrder = false;
            for(int j=0; j<minLen; j++){
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);
                
                if(c1!=c2){
                    graph.get(c1).add(c2);
                    inDegree.put(c2, inDegree.get(c2)+1);
                    foundOrder = true;
                    break;
                }
            }
            if(!foundOrder && w1.length() > w2.length()){
                return "";
            }
        }
        Queue<Character> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        
        for (char c: inDegree.keySet()){
            if (inDegree.get(c)==0){
                queue.offer(c);
            }
    }
    while (!queue.isEmpty()){
        char curr = queue.poll();
        result.append (curr);
        
        for(char neighbor: graph.get(curr)){
            inDegree.put(neighbor, inDegree.get(neighbor)-1);
            if(inDegree.get(neighbor)==0){
                queue.offer(neighbor);
            }
        }
    }
    if (result.length() != inDegree.size()){
        return "";
    }
    
     return result.toString();
    }
}
