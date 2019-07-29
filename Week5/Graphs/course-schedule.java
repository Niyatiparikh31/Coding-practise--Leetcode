class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses<=1)
            return true;
        
        if(prerequisites.length==0 || prerequisites[0].length==0)
            return true;
        
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
        
        while(!queue.isEmpty())
        {
            int key = queue.poll();
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
        
        return remCourses==0;
        
    }
}