class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll(","," ");
        
        paragraph = paragraph.replaceAll("\\p{P}","");
    
        String[] first = paragraph.split(" ");
        
        HashMap<String, Integer> hmap = new HashMap<>();
        HashSet<String> hset = new HashSet<>();
        for(int j=0;j<banned.length;j++)
        {
            hset.add(banned[j]);
        }
        
        for(int i=0;i<first.length;i++)
        {
            if(!hset.contains(first[i]) && !first[i].equals(""))
            {
                Integer a = hmap.get(first[i]);
                
                if(a!=null)
                {
                    hmap.put(first[i],++a);
                }
                else
                {
                    hmap.put(first[i],1);
                }
            }
        }
        
        int max=0;
        for(Map.Entry<String, Integer> m1 : hmap.entrySet())
        {
           
            max = Math.max(max, m1.getValue());   
        }
        
        for(Map.Entry<String, Integer> m1 : hmap.entrySet())
        {
           if(m1.getValue()==max)
               return m1.getKey();
        }
        
       
        return "";
    }
}