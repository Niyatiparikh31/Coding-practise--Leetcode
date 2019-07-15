class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int start=0,end=nums.length-1, mid=0;
        while(start<end)
        {
            mid=(start+end)/2;
            
            if(nums[mid+1]>nums[mid])
            {
                start=mid+1;
            }
            else if(nums[mid+1]<nums[mid])
            {
                end=mid;
            }
        }
        return start;
    }
}