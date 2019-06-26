class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            Integer a= hmap.get(nums[i]);
            if(hmap.get(nums[i])==null)
            {
                hmap.put(nums[i], 1);
            }
            else
            {
                hmap.put(nums[i],++a);
            }
        }
        for(Map.Entry m : hmap.entrySet()){
            if((Integer)m.getValue()==1)
                return (Integer)m.getKey();
        }
        
        return 0;
        
    }
}