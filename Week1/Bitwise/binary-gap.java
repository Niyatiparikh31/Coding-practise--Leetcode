class Solution {
    public int binaryGap(int N) {
        int diff=0;
        String abc = Integer.toBinaryString(N);
        for(int i=0;i<abc.length();i++){
           if(abc.charAt(i)=='1')
        { 
            for(int j=i+1;j<abc.length();j++){
        
            if(abc.charAt(j)=='1')
            {
                diff= Math.max(diff,(j-i));
                break;
            }
        }
            
        }
        
        }
        System.out.println(abc);
        
        return diff;
        
    }
}