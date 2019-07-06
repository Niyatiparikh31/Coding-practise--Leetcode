class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        if(!checkRows(board))
            return false;
        
        if(!checkCols(board))
            return false;
        
        if(!checkBox(board))
            return false;
        
        return true;
        
    }
    
    public boolean checkRows(char[][] board)
    {
         HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0;i<9;i++)
        {
           
            for(int j=0;j<9;j++)
            {
                if(!hmap.containsKey(board[i][j]))
                    hmap.put(board[i][j],1);
                else if(board[i][j]!='.' && hmap.containsKey(board[i][j]))
                {
                     return false;
                }
                    
            }
            
            
            hmap.clear();
            
        }
        return true;
    
    }
    
    public boolean checkCols(char[][] board)
    {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(!hmap.containsKey(board[j][i]))
                    hmap.put(board[j][i],1);
                else if(board[j][i]!='.' && hmap.containsKey(board[j][i]))
                {
                     return false;
                }
                    
            }
            
            hmap.clear();
            
        }
        return true;
    }
    
    public boolean checkBox(char[][] board)
    {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int k=0;k<9;k=k+3)
        {
            
            for(int l=0;l<9;l=l+3)
            {
                
                for(int i=0;i<3;i++)
                {

                    for(int j=0;j<3;j++)
                    {
                        if(!hmap.containsKey(board[i+l][j+k]))
                            hmap.put(board[i+l][j+k],1);
                        else if(board[i+l][j+k]!='.' && hmap.containsKey(board[i+l][j+k]))
                        {
                             return false;
                        }

                    }
                                 

                }
                hmap.clear();
            }
        }
        return true;
    }
    
}