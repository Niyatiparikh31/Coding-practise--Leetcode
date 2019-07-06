class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> hmap = new HashMap<>();
        HashMap<Character,Character> hmap1 = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(hmap.containsKey(s.charAt(i)))
            {
                if(hmap.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else
            {
                hmap.put(s.charAt(i),t.charAt(i) );
                
            }
            if( hmap1.containsKey(t.charAt(i)))
            {
                if(hmap1.get(t.charAt(i))!=s.charAt(i))
                    return false;
            }
            else
            {
                hmap1.put(t.charAt(i),s.charAt(i) );
            }
                
        }
      
        return true;
        
    }
}