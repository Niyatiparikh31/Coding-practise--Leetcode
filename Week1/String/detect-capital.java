class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
    
        for(int i=0;i<word.length();i++)
        {
             if((int) word.charAt(i)<97)
             {
                 count=count+1;
             }
        }
        
        if(count==0)
        {
            return true;
        }
        else if(count==1)
        {
            if((int) word.charAt(0)<97)
                return true;
        }
        else if(count==word.length())
        {
            return true;
        }
        
        return false;
    }
}