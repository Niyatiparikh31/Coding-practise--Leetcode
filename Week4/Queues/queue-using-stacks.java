class MyQueue {
    Stack<Integer> stack;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        
        Stack<Integer> stack1 = new Stack<Integer>();
        
        while(!stack.empty())
            stack1.push(stack.pop());
        
        stack.push(x);
        
        while(!stack1.empty())
            stack.push(stack1.pop());
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        return stack.pop();
        
    }
    
    /** Get the front element. */
    public int peek() {
        
        return stack.peek();
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        
        if(stack.size()==0)
            return true;
        return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */