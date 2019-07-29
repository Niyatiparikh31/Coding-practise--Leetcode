class Solution {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    List<Integer> tempList = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) 
    {
        backtrack( nums, 0);
        return list;
    }

    private void backtrack( int [] nums, int start)
    {
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++)
        {
            tempList.add(nums[i]);
           
            backtrack(nums, i + 1);
            
            tempList.remove(tempList.size() - 1);
            
        }
    }
}