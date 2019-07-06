class Solution {
    public char findTheDifference(String s, String t) {
        
        HashMap<Character, Integer> hmap1 = new HashMap<>();
        HashMap<Character, Integer> hmap2 = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            Integer a = hmap1.get(s.charAt(i));
            if(a!=null)
            {
                hmap1.put(s.charAt(i),++a);
            }
            else
                hmap1.put(s.charAt(i),1);
        }
        
        for(int i=0;i<t.length();i++)
        {
            Integer a = hmap2.get(t.charAt(i));
            if(a!=null)
            {
                hmap2.put(t.charAt(i),++a);
            }
            else
                hmap2.put(t.charAt(i),1);
        }
        
        for(Map.Entry<Character, Integer> m1 : hmap2.entrySet())
        {
            if(!hmap1.containsKey(m1.getKey()))
                return m1.getKey();
            else 
            {
                if(m1.getValue()!=hmap1.get(m1.getKey()))
                    return m1.getKey();
            }
        }
        return ' ';
        
//         char[] c1 = s.toCharArray();
//         Arrays.sort(c1);
//         char[] c2 = t.toCharArray();
//         Arrays.sort(c2);
        
//         for(int i=0;i<c2.length-1;i++)
//         {
//             if(c1[i]!=c2[i])
//                 return c2[i];
//         }
//         return c2[c2.length-1];
    }
}