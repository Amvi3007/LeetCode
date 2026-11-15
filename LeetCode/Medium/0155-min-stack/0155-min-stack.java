class MinStack {
    ArrayList<Integer>list;
    ArrayList<Integer>minlist;
    public MinStack() {
        list = new ArrayList<>();
        minlist = new ArrayList<>();
    }
    
    public void push(int value) {
        list.add(value);
        if(minlist.isEmpty()){
            minlist.add(value);
        }else{
            int min = Math.min(value,minlist.get(minlist.size()-1));
            minlist.add(min);
        }
    }
    
    public void pop() {
        if(list.isEmpty()){
            return;
        }
        minlist.remove(minlist.size()-1);
        list.remove(list.size()-1);
    }
    
    public int top() {
        if(list.isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return minlist.get(minlist.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */