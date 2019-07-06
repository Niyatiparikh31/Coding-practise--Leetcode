class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        TreeMap<Integer, Integer> hmap1 = new TreeMap<>();
        TreeMap<Integer, Integer> hmap2 = new TreeMap<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
    
        for(int i=0;i<nums1.length;i++)
        {
            Integer a = hmap1.get(nums1[i]);
            if(!hmap1.containsKey(nums1[i]))
                hmap1.put(nums1[i],1);
            else
                hmap1.put(nums1[i],++a);
        }
        
        for(int i=0;i<nums2.length;i++)
        {
            Integer a = hmap2.get(nums2[i]);
            if(!hmap2.containsKey(nums2[i]))
                hmap2.put(nums2[i],1);
            else
                hmap2.put(nums2[i],++a);
        }
        
             
        for(Map.Entry<Integer, Integer> m1 : hmap1.entrySet())
        {
            if(hmap2.containsKey(m1.getKey()))
            {
              ans.add(m1.getKey());
            }
        }
       
        
        int[] ans1 = new int[ans.size()];
        
        for(int k=0;k<ans.size();k++)
        {
            ans1[k]=ans.get(k);
        }
        return ans1;
        
        
    }
}