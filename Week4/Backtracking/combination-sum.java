class Solution {
    
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    List<Integer> tempList = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        backtrack(candidates, target, 0);
        
        return list;
        
    }
    
    public void backtrack(int[] candidates, int remain, int start)
    {
        if(remain<0)
            return;
        else if(remain==0)
            list.add(new ArrayList<>(tempList));
        else
        {
            for(int i=start;i<candidates.length;i++)
            {
                tempList.add(candidates[i]);
                backtrack(candidates, remain-candidates[i], i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}