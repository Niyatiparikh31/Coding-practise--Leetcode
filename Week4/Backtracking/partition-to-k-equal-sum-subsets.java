class Solution {
    
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int target=0;
        
        for(int i: nums)
        {
            target+=i;
        }
        
        if(target%k!=0 || k <= 0 || k > nums.length)
        {
            return false;
        }
        
        return helper(nums, k, new boolean[nums.length], 0, 0, target/k);
        
    }
    
    public boolean helper(int[] nums, int k, boolean[] used, int index, int ongoing, int target)
    {
        if(k==1)
            return true;
        
        if(ongoing==target)
            return helper(nums, k-1, used, 0, 0, target);
        
        for(int i=index;i<nums.length;i++)
        {
            if(!used[i] && ongoing+nums[i]<= target)
            {
                used[i]=true;
                
                if(helper(nums, k, used, i+1, ongoing + nums[i], target))
                    return true;
                
                used[i]=false;
            }
            
        }
        
        return false;
        
    }
}