class MyStack {
    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        
        queue = new LinkedList<>();
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        
        queue.add(x);
        for(int i=0;i<queue.size()-1;i++)
        {
            int y = queue.remove();
            queue.add(y);
        }
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        
        return queue.remove();
        
    }
    
    /** Get the top element. */
    public int top() {
        
        return queue.peek();
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue.size()==0)
            return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */