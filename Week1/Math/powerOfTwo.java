class Solution {
    public boolean isPowerOfTwo(int n) {
        
        double x=Math.log(n);
        
        if(n==1)
            return true;
        
        for(int i=0;i<100;i++)
        {
            if(x/i==Math.log(2))
            {
                return true;
            }
        }
        
        return false;
        
    }
}