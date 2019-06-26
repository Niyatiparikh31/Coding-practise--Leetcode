class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll(" ", "");
        //s = s.replaceAll(",", "");
        s = s.replaceAll("\\p{Punct}", "");
        
        s = s.toLowerCase();
        
        String temp =s;
        StringBuilder sb = new StringBuilder(temp);

        temp = sb.reverse().toString();
        
        System.out.println(temp);
        System.out.println(s);
       
        if(temp.equals(s))
            return true;
        else
            return false;
        
    }
}