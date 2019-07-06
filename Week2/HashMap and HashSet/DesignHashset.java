class MyHashSet {
    
     
    ArrayList<Integer> arrList;
    /** Initialize your data structure here. */
    public MyHashSet() {
        arrList=new ArrayList<>();
    }
    
    public void add(int key) {
        int flag=0;
        for(int i=0;i<arrList.size();i++)
        {
            if(arrList.get(i)==key){
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            arrList.add(key);
        }
    }
    
    public void remove(int key) {
        for(int i=0;i<arrList.size();i++)
        {
            if(arrList.get(i)==key){
                arrList.remove(new Integer(key));
                break;
            }
        }
        
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        for(int i=0;i<arrList.size();i++)
        {
            if(arrList.get(i)==key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */