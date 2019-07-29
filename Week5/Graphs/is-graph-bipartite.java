class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int[] colors = new int[graph.length];
        
        for(int i=0;i<graph.length;i++)
        {
            if(colors[i]==0 && !validColor(graph, colors, 1,i))
            {
                return false;
            }
        }
        return true;
    }
    
    public boolean validColor(int[][] graph, int[] colors, int color, int node)
    {
        if(colors[node] != 0)
        {
            return colors[node]==color;
        }
        
        colors[node] =color;
        for(int next : graph[node])
        {
            if(!validColor(graph, colors, -color, next))
                return false;
        }
        
        return true;
    }
    
}