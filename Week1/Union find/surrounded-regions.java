class Solution {
    public void solve(char[][] board) {
        if(board.length==0)
            return;
        int row=board.length, col= board[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='-';
                }
            }
        }
        
        
        for(int i=0;i<row;i++)
        {
            if(board[i][0]=='-'){
                board[i][0]='O';
                makeZero(board,i, 1);
            }
        }
        
        
        for(int i=0;i<row;i++)
        {
            if(board[i][col-1]=='-'){
                board[i][col-1]='O';
                makeZero(board,i, col-2);
            }
                
        }
        
        for(int i=0;i<col;i++)
        {
            if(board[0][i]=='-'){
                 board[0][i]='O';
                makeZero(board,1, i);
            }
               
        }
        
        for(int i=0;i<col;i++)
        {
            if(board[row-1][i]=='-'){
                 board[row-1][i]='O';
                makeZero(board,row-2, i);
            }
               
        }
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(board[i][j]=='-')
                {
                    board[i][j]='X';
                }
            }
        }
        
        
    }
    
    public void makeZero(char[][] board, int i, int j)
    {
        
        if(i<0 || i>=board.length || j<0 || j>=board[0].length  || board[i][j]=='X' || board[i][j]=='O')
        {
            return;
        }
        board[i][j]='O';
        makeZero(board,i+1,j);
        makeZero(board,i-1,j);
        makeZero(board,i,j+1);
        makeZero(board,i,j-1);
        
    } 
}