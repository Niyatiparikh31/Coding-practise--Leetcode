class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length==0)
            return new int[0][0];
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] f, int[] s){
                return f[0]-s[0];
        }
        });
        
        List<int[]> final_ans = new ArrayList<int[]>();
        int[][] ans = new int[intervals.length][2];
        int j=0;
        ans[j][0] = intervals[0][0];
        ans[j][1] = intervals[0][1];
        final_ans.add(ans[j]);
        
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=ans[j][1])
            {

                ans[j][1]=Math.max(intervals[i][1],ans[j][1]);
                   
            }
            else
            {
                j++;
                ans[j][0] = intervals[i][0];
                ans[j][1] = intervals[i][1];
                final_ans.add(ans[j]);
                
            }
        }
        
        return final_ans.toArray(new int[final_ans.size()][2]);
    }
}