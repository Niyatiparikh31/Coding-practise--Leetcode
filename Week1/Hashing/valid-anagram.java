class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> hmap1 = new HashMap<>();
        HashMap<Character, Integer> hmap2 = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            Integer a = hmap1.get(s.charAt(i));
            if(hmap1.containsKey(s.charAt(i)))
            {
                hmap1.put(s.charAt(i), ++a);
            }
            else
            {
                hmap1.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            Integer a = hmap2.get(t.charAt(i));
            if(hmap2.containsKey(t.charAt(i)))
            {
                hmap2.put(t.charAt(i), ++a);
            }
            else
            {
                hmap2.put(t.charAt(i),1);
            }
        }
        
        
        if(hmap1.equals(hmap2))
            return true;
        else
            return false;
        
        
        
    }
}