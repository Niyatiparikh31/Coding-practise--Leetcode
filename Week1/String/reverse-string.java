class Solution {
    public void reverseString(char[] s) {
        
        helper(s,0,s.length-1);
        
    }
    
    public void helper(char[] s, int start, int end)
    {
        char temp;
        if(start>end)
        {
            return;
        }
        temp=s[start];
        s[start]=s[end];
        s[end]= temp;
        
        helper(s,start+1,end-1);
        
        
        
        System.out.print(s[start]);
    }
}
