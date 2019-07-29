class Solution {
    public boolean isValid(String s) {
        
        if(s.equals(""))
        {
            return true;
        }
        
        Stack<Character> stack = new Stack<Character>(); 
        
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')') && stack.empty())
                return false;
            
            else if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(' )
                stack.push(s.charAt(i));
            
            else if(s.charAt(i)=='}' && (Character) stack.peek()=='{')
                stack.pop();
            
            else if(s.charAt(i)==']' && (Character) stack.peek()=='[')
                stack.pop();
            
            else if(s.charAt(i)==')' && (Character) stack.peek()=='(')
                stack.pop();
            
            else
                return false;
           
        }
        
        if(stack.empty())
            return true;
        else
            return false;
        
    }
}