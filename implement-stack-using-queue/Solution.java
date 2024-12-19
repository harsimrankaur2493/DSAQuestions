class MyStack {
    Queue <Integer> Q1, Q2;

    public MyStack() {
        Q1= new LinkedList<>();
        Q2= new LinkedList<>();
    }
    
    public void push(int x) {
        while(!Q1.isEmpty()){
            Q2.add(Q1.poll());
        }
        Q1.add(x);

        while(!Q2.isEmpty()){
            Q1.add(Q2.poll());
        }
    }
    
    public int pop() {
        return Q1.poll();
    }
    
    public int top() {
        return Q1.peek();
    }
    
    public boolean empty() {
        return Q1.isEmpty();
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
