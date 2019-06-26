class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String ans = "";
        
        if(strs==null || strs.length==0)return "";
        
        int j=0;
        while(j<strs[0].length()){
        for(int i=0;i<strs.length;i++)
        {
            if(j==strs[i].length() || strs[0].charAt(j)!=strs[i].charAt(j))
            {
                 return strs[0].substring(0, j);
            }
        }
            //ans= ans+strs[0].charAt(j);
        j++;
        }
        return strs[0];
        
    }
}