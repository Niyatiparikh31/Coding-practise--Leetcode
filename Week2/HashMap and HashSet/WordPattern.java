class Solution {
    public boolean wordPattern(String pattern, String str) {
      
        HashMap<Character,String> hmap = new HashMap<>();
        HashMap<String,Character> hmap1 = new HashMap<>();
    
        
        char[] s = pattern.toCharArray();
        String[] t = str.split(" ");
        
        if(s.length!=t.length)
            return false;
        
        for(int i=0;i<s.length;i++)
        {
            if(hmap.containsKey(s[i]))
            {
                if(!hmap.get(s[i]).equals(t[i]))
                    return false;
            }
            else
            {
                hmap.put(s[i],t[i]);
                
            }
            if( hmap1.containsKey(t[i]))
            {
                if(hmap1.get(t[i])!=s[i])
                    return false;
            }
            else
            {
                hmap1.put(t[i],s[i] );
            }
                
        }
      
        return true;
        
        
    }
}