class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    makeZero(grid, i, j);
                }
            }
        }
        return count;
        
    }
    
    public void makeZero(char[][] grid, int i, int j)
    {
        
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length  || grid[i][j]=='0')
        {
            return;
        }
        grid[i][j]='0';
        makeZero(grid,i+1,j);
        makeZero(grid,i-1,j);
        makeZero(grid,i,j+1);
        makeZero(grid,i,j-1);
        
    } 
}