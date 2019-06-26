class Solution {
    public String reverseWords(String s) {
        
        String[] temp = s.split(" ");
        
        String[] ans = new String[temp.length];
        
        for(int i=0;i<temp.length;i++)
        {
            StringBuilder sb = new StringBuilder(temp[i]);
            ans[i]=sb.reverse().toString();
            
        }
        String result = ans[0];
        for(int i=1;i<ans.length;i++)
        {
            result = result+" "+ans[i];
        }
        
        return result;
        
    }
}