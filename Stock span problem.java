
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[ stack.peek()] <= arr[i]){
        stack.pop();        
            }    
            int currentSpan = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            span.add(currentSpan);
            stack.push(i);
        }
        return span;
    }
}
