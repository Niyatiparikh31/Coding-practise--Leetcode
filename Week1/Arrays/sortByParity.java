class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int[] Ans=new int[A.length];
        int j=0;
        for(int i=0; i<A.length;i++)
        {
            if((A[i]&1)==0)
            {
                Ans[j]=A[i];
                j++;
            }
            
        }
        for(int i=0; i<A.length;i++)
        {
            if((A[i]&1)!=0)
            {
                Ans[j]=A[i];
                j++;
            }
        }
        return Ans;
        
    }
}