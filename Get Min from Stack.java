class Solution {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    
    public Solution() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    // Add an element to the top of Stack
    public void push(int x) {
        // code here
     stack.push(x);
     if (minStack.isEmpty() || x <= minStack.peek()){
         minStack.push(x);
     }
    }

    // Remove the top element from the Stack
    public void pop() {
        // code here
        if (!stack.isEmpty()) {
            int popped = stack.pop();
            if(popped == minStack.peek()){
            minStack.pop();
           }        
        }
    }

    // Returns top element of the Stack
        
    public int peek() {
        // code here
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

        
    // Finds minimum element of Stack
    public int getMin() {
        // code here
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }
}
