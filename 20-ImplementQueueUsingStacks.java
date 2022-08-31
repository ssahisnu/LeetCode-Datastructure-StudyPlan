class MyQueue {

    //SC - O(N)
    
    Stack<Integer> stack;
    Stack<Integer> temp;
    public MyQueue() {
        stack = new Stack<>();
        temp = new Stack<>();
    }
    //O(N)
    public void push(int x) {

        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        temp.push(x);
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        
    }
    //O(1)
    public int pop() {
        return stack.pop();
    }
    //O(1)
    public int peek() {
        return stack.peek();
    }
    //O(1)
    public boolean empty() {
        return stack.isEmpty();
    }
}
