class Solution {
    public int findMinArrowShots(int[][] intervals) {
        
        if(intervals.length==0)
            return 0;
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] f, int[] s){
                return f[1]-s[1];
        }
        });
        
        
        int[][] ans = new int[intervals.length][2];
        int count=1;
        int base=intervals[0][1];
        
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>base)
            {
                count++;
                base=intervals[i][1];
            }
            
        }
       
        return count;

        
    }
}