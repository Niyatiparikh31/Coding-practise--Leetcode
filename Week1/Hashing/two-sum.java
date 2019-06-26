class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] Ans = new int[2];
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            if(hmap.containsKey(target-nums[i]))
            {
                Ans[0]=hmap.get(target-nums[i]);
                Ans[1]=i;
            }
            hmap.put(nums[i],i);
        }
        return Ans;
    }
}