class MyQueue {
    Stack<Integer> mainSt;
    Stack<Integer> healperSt;
    public MyQueue() {
        mainSt=new Stack<>();
        healperSt=new Stack<>();
    }
    
    public void push(int x) {
        mainSt.push(x);
    }
    
    public int pop() {
        while(mainSt.size()>0){
            int val=mainSt.pop();
            healperSt.push(val);
        }
        int rm=healperSt.pop();
        while(healperSt.size()>0){
            int val=healperSt.pop();
            mainSt.push(val);
        }
        return rm;
    }
    
    public int peek() {
        while(mainSt.size()>0){
            int val=mainSt.pop();
            healperSt.push(val);
        }
        int rm=healperSt.peek();
        while(healperSt.size()>0){
            int val=healperSt.pop();
            mainSt.push(val);
        }
        return rm;
    }
    
    public boolean empty() {
        return mainSt.isEmpty();
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