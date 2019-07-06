class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int ans[] = new int[2];
        HashSet<Integer> hset = new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(!hset.contains(nums[i]))
            {
                hset.add(nums[i]);
            }
            else
            {
                ans[0]=nums[i];
            }
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!hset.contains(i))
            {
                ans[1]=i;
            }
            
        }
        return ans;
    }
}