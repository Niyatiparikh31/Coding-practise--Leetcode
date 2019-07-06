class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> hmap = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            Integer a = hmap.get(s.charAt(i));
            if(hmap.containsKey(s.charAt(i)))
            {
                hmap.put(s.charAt(i), ++a);
            }
            else
            {
                hmap.put(s.charAt(i), 1);
            }
        }
        
        for(int i=0;i<s.length();i++)
        {
            if(hmap.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }
}