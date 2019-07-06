class Solution {
    public int numJewelsInStones(String J, String S) {
                
        HashSet<Character> hset = new HashSet<>();
        int count=0;
        
        for(int i=0;i<J.length();i++)
        {
            hset.add(J.charAt(i));
        }
        
        for(int i=0;i<S.length();i++)
        {
            if(hset.contains(S.charAt(i)))
                count++;
        }
        return count;
    }
}