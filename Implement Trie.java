// User function Template for Java
class Trie {
    
private class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord = false;
}
private TrieNode root;

    public Trie() {
        // Implement Trie
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()){
            int index = ch - 'a';
            if (node.children[index] == null){
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()){
            int index = ch - 'a';
            if (node.children[index] == null){
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }

    // Check if a prefix exists in the Trie
    public boolean isPrefix(String word) {
        TrieNode node = root;
        for ( char ch : word.toCharArray()){
            int index = ch - 'a';
            if (node.children[index] == null){
                return false;
            }
            node = node.children[index];
        }
        return true;
    }
}
