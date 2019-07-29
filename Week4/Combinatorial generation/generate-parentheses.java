class Solution {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
       
        helper(n, n , "" );
        return list;
    }
    
    public void helper(int left, int right, String str)
    {
        if(left==0 && right==0)
        {
            list.add(str);
            return;
        }
        
        if(left>0)
        {
            helper(left-1, right, str+"(" );
        }
        
        if(left<right)
        {
            helper(left, right-1, str+")");
        }
     
    }
    
}