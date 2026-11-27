class MinStack {
    static ArrayList<Integer> arr;
    static ArrayList<Integer> min;
    public MinStack() {
        arr = new ArrayList<>();
        min = new ArrayList<>();
    }
    
    public void push(int value) {
        arr.add(value);
        if(min.isEmpty()){
            min.add(value);
        }else{
            int m = Math.min(value,min.get(min.size()-1));
            min.add(m);
        }
    }
    
    public void pop() {
        min.remove(min.size()-1);
        arr.remove(arr.size()-1);
    }
    
    public int top() {
        int x = arr.get(arr.size()-1);
        return x;
    }
    
    public int getMin() {
        return min.get(min.size()-1);
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