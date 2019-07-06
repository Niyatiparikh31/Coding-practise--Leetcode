class Solution {
    public int distributeCandies(int[] candies) {
        
        int dis = candies.length/2;
        
        HashSet<Integer> hset = new HashSet<>();
        
        for(int i=0;i<candies.length;i++)
        {
            hset.add(candies[i]);
        }
       
        return Math.min(dis,hset.size());
        
    }
}