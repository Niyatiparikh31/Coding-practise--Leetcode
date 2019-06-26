class Solution {
    public int findComplement(int num) {
        int i=1;
        double ans=0;
        while(num>=ans){
        ans=Math.pow(2,i);
            i++;
        }
        System.out.print(i);
               
        num =num^(int)(ans-1);
        return num;
        
    }
}