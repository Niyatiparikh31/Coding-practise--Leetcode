class Solution {
    public int titleToNumber(String s) {
         
       int sum = 0;
        for(int i=s.length()-1; i>=0; i--){
            sum+=((int)(s.charAt(i))-64) * Math.pow(26, s.length()-1-i);
        }
        return sum;
        
        
    }
}