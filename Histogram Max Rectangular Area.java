class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while (i < n) {
            
            if (stack.isEmpty() || arr[i] >= arr[stack.peek()]) {
                stack.push(i++);
            }else {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = arr[top] * width;
                maxArea = Math.max(maxArea, area);
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            int area = arr[top] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
