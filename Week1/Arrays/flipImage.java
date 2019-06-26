class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] ans = new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++)
        {
            int k=0;
            for(int j=A.length-1;j>=0;j--)
            {
                ans[i][k]=A[i][j];
                k++;
            }
        }
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                if(ans[i][j]==0)
                {
                    ans[i][j]=1;
                }
                else
                    ans[i][j]=0;
            }
        }
        return ans;
    }
}