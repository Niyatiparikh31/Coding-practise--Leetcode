class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] str1 = s.toCharArray();
        Arrays.sort(str1);
        char[] str2 = t.toCharArray();
        Arrays.sort(str2);
        
        s = new String(str1);
        t = new String(str2);
        
        if(s.equals(t))
            return true;
        
        return false;
        
        
    }
}