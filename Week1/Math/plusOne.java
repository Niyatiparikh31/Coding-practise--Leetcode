class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]=digits[digits.length-1]+1;
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[0]==10)
            {
                ans.add(0,0);
                ans.add(0,1);
                break;
            }
               if(digits[i]==10)
               {
                   digits[i-1]=digits[i-1]+1;
                   ans.add(0,0);
                   
               }
                else
                    ans.add(0,digits[i]);
               
                
        }
        //Collection.reverse(ans);
        
        int[] abc = new int[ans.size()];
        
        for(int i=0;i<ans.size();i++)
        {
            abc[i]=ans.get(i);
        }
        
        return abc;
        
    }
}