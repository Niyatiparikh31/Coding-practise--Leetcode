class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] ans = new int[numCourses];
        
        if(numCourses==0)
            return new int[0];
        
        
        if(prerequisites.length==0 || prerequisites[0].length==0)
        {
            for(int i=0;i<numCourses;i++)
                ans[i]=i;
            
            return ans;
        }
        
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        
        for(int i=0;i<numCourses;i++)
        {
            graph.put(i, new HashSet<Integer>());
        }
        
        for(int i=0;i<prerequisites.length;i++)
        {
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        int remCourses = numCourses;
        
        for(Map.Entry<Integer, Set<Integer>> entry : graph.entrySet())
        {
            if(entry.getValue().size()==0)
            {
                queue.offer(entry.getKey());
                remCourses--;
            }
        }
        int x =0;
        while(!queue.isEmpty())
        {
            int key = queue.poll();
            ans[x]=key;
            x++;
            for(Map.Entry<Integer, Set<Integer>> entry : graph.entrySet())
            {
                if(entry.getValue().contains(key))
                {
                    entry.getValue().remove(key);
                    if(entry.getValue().size()==0)
                    {
                        queue.offer(entry.getKey());
                        remCourses--;
                    }
                }
            }
            
        }
        
        return remCourses==0?ans:new int[0];
    }
}