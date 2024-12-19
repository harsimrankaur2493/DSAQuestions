class MyQueue {
        Stack <Integer> S1 ,S2;

    public MyQueue() {
        S1= new Stack<>();
        S2= new Stack<>();
    }
    
    public void push(int x) {
        while(!S1.isEmpty()){
            S2.push(S1.peek());
            S1.pop();
        }
        S1.push(x);

        while(!S2.isEmpty()){
            S1.push(S2.peek());
            S2.pop();
        }
    }
    
    public int pop() {
        int val=S1.pop();
        return val;
    }
    
    public int peek() {
        return S1.peek();
    }
    
    public boolean empty() {
        return S1.isEmpty();
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
