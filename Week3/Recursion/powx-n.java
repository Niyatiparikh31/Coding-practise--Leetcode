class Solution {
    public double myPow(double x, int n) {
                
        if(n>=0)
        {
            return pow(x,n,1.0);
        }
        else
        {
            return 1/(x*pow(x,-n-1,1.0));
        }
        
    }
    
    public double pow(double x, int n , double ans)
    {
               
        if(n==0)
            return ans;
        
        else if(n%2==0)
        {
            return pow(x*x,n>>1,ans);
        }
        else
            return pow(x,n-1,ans*x);
        
    }
}