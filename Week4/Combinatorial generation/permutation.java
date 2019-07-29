class Solution {
    List<List<Integer>> final_ans = new ArrayList<List<Integer>>();
    
    
    public List<List<Integer>> permute(int[] nums) {
        
        permutation(nums, 0, nums.length-1);
        
        return final_ans;
        
    }
    
    public void permutation(int[] nums, int start, int end)
    {
        if(start==end){
            List<Integer> ans = new ArrayList<>();
            
            for(int i=0;i<nums.length;i++)
            {
                
                ans.add(nums[i]);
            }
            
            final_ans.add(ans);
          
        }    
        for(int i=start;i<=end;i++)
        {
            swap(nums, start, i);
            permutation(nums, start+1, end);
            swap(nums, start, i);
        }
    }
    
    public int[] swap(int[] nums, int start, int end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        
        return nums;
    }
    
}