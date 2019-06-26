class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i=left;i<=right;i++)
        {
            
            if (selfDividing(i)) ans.add(i);
        }
        return ans;
    }
    
    public boolean selfDividing(int n) {
        int x = n;
        while (x > 0) {
            int d = x % 10;
            x /= 10;
            if (d == 0 || (n % d) > 0) return false;
        }
        return true;
    }
    
    
}