class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer> stack = new Stack<Integer>(); 
        int ans=0;
        
        for(int i=0;i<ops.length;i++)
        {
            if(ops[i].equals("D") && !stack.empty())
            {
                int a = 2*(Integer)stack.peek();
                stack.push(a);
            }
            else if(ops[i].equals("C") && !stack.empty())
            {
                stack.pop();
            }
            else if(ops[i].equals("+") && !stack.empty())
            {
                int x = stack.pop();
                int y = stack.peek()+x;
                stack.push(x);
                stack.push(y);
            }
            else
            {
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        
        for(int score : stack) ans += score;
               
        return ans;
    }
}