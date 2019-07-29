class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans = new int[nums1.length];
        
        Stack<Integer> stack = new Stack<Integer>(); 
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0;i<nums2.length;i++)
        {
            while(!stack.isEmpty() && stack.peek()<nums2[i])
            {
                hmap.put(stack.pop(),nums2[i]);
            }
            
            stack.push(nums2[i]);
        }
        
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=hmap.getOrDefault(nums1[i],-1);
        }
        
        return ans;
        
    }
}