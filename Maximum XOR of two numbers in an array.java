// User function Template for Java

class Solution {
    static class TrieNode { 
        TrieNode[] child = new TrieNode[2];
    }
    
    private void insert(TrieNode root, int num){
        TrieNode node = root;
        for (int i = 31; i >= 0; i--){
            int bit = (num >> i) & 1;
            if (node.child[bit] == null){
                node.child[bit] = new TrieNode();
            }
            node = node.child[bit];
          }
        }
        private int getMaxXor(TrieNode root, int num){
            TrieNode node = root;
            int xor = 0;
            for (int i = 31; i >= 0; i--){
                int bit = (num >> i)& 1;
                int opposite = 1 - bit;
                if (node.child[opposite] != null){
                    xor |= (1 << i);
                    node = node.child[opposite];
                }else{
                    node = node.child[bit];
                }
            }
            return xor;
        }
        
    public int maxXor(int[] arr) {
        // code here
        TrieNode root = new TrieNode();
        for (int num : arr){
            insert(root, num);
        }
        int max = 0;
        for (int num : arr){
            max = Math.max(max, getMaxXor(root, num));
        }
        return max;
    }
}
