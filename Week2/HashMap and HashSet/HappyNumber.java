class Solution {
    Set<Integer> hset = new HashSet<>();
    public boolean isHappy(int n) {
        int sum=0;
        if(n==1)
        {
                return true;
        }
              
        if(hset.add(n)){
             
                while(n>=1){
                    sum = sum+((n%10)*(n%10));
                    n=n/10;
                }
                return isHappy(sum);
            
        } 
        return false;
    }
}