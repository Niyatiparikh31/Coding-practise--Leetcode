class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        char[] cpat = p.toCharArray();
        Arrays.sort(cpat);
        String pat = new String(cpat);
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(p.length()>s.length())
            return ans;
        
                
        for(int i=0;i<s.length()-p.length()+1;i++)
        {
            String abc = s.substring(i,i+p.length());
            char[] def = abc.toCharArray();
            Arrays.sort(def);
            String nabc = new String(def);
            if(pat.equals(nabc))
                ans.add(i);
            
        }
        
        return ans;
        
    }
}