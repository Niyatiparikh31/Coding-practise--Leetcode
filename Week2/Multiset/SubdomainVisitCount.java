class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        HashMap<String, Integer> hmap = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        int count = 0;
        String str ="";
        
        for(int i=0;i<cpdomains.length;i++)
        {
            
            count = Integer.parseInt(cpdomains[i].substring(0, cpdomains[i].indexOf(" ")));
            
            str = cpdomains[i].substring(cpdomains[i].indexOf(" ")+1);
            
            String[] abc = str.split("\\.");
                      
            String app = "";
            for(int j=abc.length-1;j>=0;j--)
            {
                app = abc[j]+"."+app;
                Integer val = hmap.get(app);
                if(hmap.containsKey(app))
                    hmap.put(app, count+val);
                else
                    hmap.put(app, count);
              
            }
            
        }
        
        for(Map.Entry<String, Integer> m : hmap.entrySet())
        {
            ans.add(m.getValue()+" "+ m.getKey().substring(0,m.getKey().length()-1));
        }
        
        return ans;
        
    }
}