class Solution {
    public void rotate(int[] nums, int k) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            queue.add(nums[nums.length-i-1]);
        }
        for(int i=0;i<k;i++)
        {
            
            int x = queue.remove();
            queue.add(x);
            
        }
        
        for(int i=0;i<nums.length;i++)
        {
            nums[nums.length-i-1]=queue.remove();
        }
    
        
    }
}