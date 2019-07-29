class Solution {
    
    HashMap<String, Boolean> hmap = new HashMap<>();
    public boolean canPartition(int[] nums) {
        int total =0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        
        if(total%2!=0)
        {
            return false;
        }
        
        return helper(nums, total, 0, 0);
    }
    
    public boolean helper(int[] nums, int total, int index, int sum)
    {
        String abc = index+""+sum;
        if(hmap.containsKey(abc))
        {
            return hmap.get(abc);
        }
        else if(sum *2 == total)
            return true;
        else if(sum * 2 >total || index>=nums.length)
            return false;
        Boolean ans = helper(nums, total, index+1, sum) || helper(nums, total, index+1, sum+nums[index]);
        hmap.put(abc, ans);
            return ans;
    }
}