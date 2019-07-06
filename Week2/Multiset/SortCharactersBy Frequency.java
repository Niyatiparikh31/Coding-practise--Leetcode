class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hmap = new HashMap<Character, Integer>();
               
        int max=1;
        for(int i=0;i<s.length();i++)
        {
            Integer a = hmap.get(s.charAt(i));
            if(a!=null)
            {
                hmap.put(s.charAt(i),++a);
                max= Math.max(a,max);
            }
            else
            {
                hmap.put(s.charAt(i),1);
            }
            
            
        }

        //String ans = "";
        StringBuilder sb = new StringBuilder();
        for(int i=max;i>0;i--){
            for(Map.Entry<Character, Integer> m1 :hmap.entrySet())
            {
                if(m1.getValue()==i)
                {
                    for(int j=0;j<i;j++){
                        sb.append(m1.getKey());
                    }
                }
            }
        }
        
        return sb.toString();
        
        
        
    }
}