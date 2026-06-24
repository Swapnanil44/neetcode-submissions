class MinStack {
    private Stack<Integer> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> temp = new Stack<Integer>();
        int min = stack.peek();

        while(!stack.isEmpty()){
            int it = stack.pop();
            min = Math.min(min,it);
            temp.push(it);
        }

        while(!temp.isEmpty()){
            int it = temp.pop();
            stack.push(it);
        }
        return min;
    }
}
