class Solution {
    
    private class TrieNode{
        Map<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode(){
            children = new HashMap<>();
            endOfWord = false;
        }
    }
    
    private TrieNode root;
    /** Initialize your data structure here. */
    
    
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
        
    public String longestWord(String[] words) {
        root = new TrieNode();
        Arrays.sort(words, Collections.reverseOrder());
        Arrays.sort(words, Comparator.comparingInt(String::length));
                
        for(int i = 0;i<words.length;i++)
        {
            insert(words[i]);
        }
        
        for(int i = words.length-1;i>=0;i--)
        {
            int flag =1;
            for(int j=words[i].length()-1;j>0;j--)
            {
                if(!search(words[i].substring(0,j))){
                    System.out.println(words[i].substring(0,j));
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                return words[i];
            }
        }
      
        return "";
        
    }
}