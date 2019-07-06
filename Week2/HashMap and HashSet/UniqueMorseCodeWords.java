class Solution {
    public int uniqueMorseRepresentations(String[] words) {
      String[] morse= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] m_words = new String[words.length];
        for(int i=0;i<words.length;i++)
        {
            String abc="";
            for(int j=0;j<words[i].length();j++)
            {
                int a = ((int) words[i].charAt(j)-97);
                abc=abc+morse[a];
                
                
            }
            m_words[i] = abc;
            System.out.println(abc);
            
        }
        
        HashMap<String, Integer> hmap = new HashMap<>();
        
        for(int i=0;i<m_words.length;i++)
        {
            Integer a = hmap.get(m_words[i]);
            
            if(a==null)
                hmap.put(m_words[i], 1);
            else
                hmap.put(m_words[i], ++a);
        }
        
        
        return hmap.size();
    }
    
}