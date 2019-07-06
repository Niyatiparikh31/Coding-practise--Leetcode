class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String Merge = A+" "+B;
        String[] A1 = Merge.split(" ");
        
        HashMap<String, Integer> hmap1 = new HashMap<>();
        
        
        for(int i=0;i<A1.length;i++)
        {
            Integer a = hmap1.get(A1[i]);
            if(!hmap1.containsKey(A1[i]))
                hmap1.put(A1[i],1);
            else
                hmap1.put(A1[i],++a);
        }
        
        ArrayList<String> ans = new ArrayList<String>();
        for(Map.Entry<String, Integer> m1 : hmap1.entrySet())
        {
           
                if(m1.getValue()<2)
                {
                    ans.add(m1.getKey());
                }
            
        }
     
        String[] Ans = new String[ans.size()];
        for(int i =0; i<ans.size();i++)
        {
            Ans[i]= ans.get(i);
        }
        
        return Ans;
        
    }
}