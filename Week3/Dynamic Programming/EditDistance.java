class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] arr = new int[m+1][n+1];
        
        for(int i=0;i<=m;i++)
        {
            arr[i][0]=i;
        }
        for(int j=0;j<=n;j++)
        {
            arr[0][j]=j;
        }
        
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                    arr[i][j]=arr[i-1][j-1];
                }
                else
                {
                    int a = Math.min(arr[i-1][j] , arr[i][j-1]);
                    arr[i][j] = Math.min(a , arr[i-1][j-1]) + 1;
                }
            }
        }
        
        return arr[m][n];
        
    }
}