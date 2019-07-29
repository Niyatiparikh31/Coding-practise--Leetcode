class Solution {
    
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    List<Integer> tempList = new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=i+1;
        }
        
        backtrack( nums, 0, k);
        return list;
        
    }
    
    private void backtrack(int [] nums, int start, int k)
    {
        if(tempList.size()==k)
        {
            list.add(new ArrayList<>(tempList));
        }
        for(int i = start; i < nums.length; i++)
        {
            tempList.add(nums[i]);
           
            backtrack(nums, i + 1, k);
            
            tempList.remove(tempList.size() - 1);
            
        }
    }
    
}