class MyCircularQueue {
    int arr[];
    int rear,front,size,capacity;
    public MyCircularQueue(int k) {
        arr = new int[k];
        rear = -1;
        front = 0;
        capacity = k;
        size = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        rear = (rear + 1)% capacity;
        arr[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        front = (front+1)%capacity;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty())return -1;
        int x = arr[front];
        return x;
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        int x = arr[rear];
        return x;
    }
    
    public boolean isEmpty() {
        if(size == 0)return true;
        return false;
    }
    
    public boolean isFull() {
        if( size == capacity ){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */