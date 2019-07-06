class Trie {
    
    private class TrieNode{
        Map<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode(){
            children = new HashMap<>();
            endOfWord = false;
        }
    }
    
    private final TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr = root;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if(node == null)
            {
                node = new TrieNode();
                curr.children.put(ch, node);
            }
            curr = node;
        }
        
        curr.endOfWord = true;
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        
        TrieNode curr = root;
        
        for(int i=0;i<word.length();i++)
        {
            char ch  = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            
            if(node == null)
            {
                return false;
            }
            
            curr = node;
        }
        
        return curr.endOfWord;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        
        TrieNode curr = root;
        for(int i=0;i<prefix.length();i++)
        {
            char ch = prefix.charAt(i);
            TrieNode node = curr.children.get(ch);
            
            if(node == null)
            {
                return false;
            }
            
            curr = node;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */