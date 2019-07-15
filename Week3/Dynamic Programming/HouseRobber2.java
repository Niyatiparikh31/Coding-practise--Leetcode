class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        
        int[] nums0 = nums.clone();
        int[] nums1 = nums.clone();
        int ch0=0,ch1=0;
        
        for(int i=0;i<nums0.length-1;i++)
        {
            if(i==1)
                nums0[i] = Math.max(nums0[0],nums0[1]);
            else if(i>1){
                nums0[i] = Math.max(nums0[i]+nums0[i-2],nums0[i-1]);
            }
            ch0 = nums0[nums0.length-2];
        }
        
        
        for(int i=1;i<nums1.length;i++)
        {
            if(i==2)
                nums1[i] = Math.max(nums1[2],nums1[1]);
            else if(i>2){
                nums1[i] = Math.max(nums1[i]+nums1[i-2],nums1[i-1]);
            }
            ch1 = nums1[nums1.length-1];
        }
        
        return Math.max(ch0,ch1);
        
    }
}